import React, { Component } from "react";
import Post from "./Post";
//import PostItem from "./PostItem"; -->for error handling demonstration

class Posts extends Component {
    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts = async () => {
        try {
            const response = await fetch("https://jsonplaceholder.typicode.com/posts");
            const data = await response.json();

            const posts = data.map(
                post => new Post(post.id, post.title, post.body)
            );

            this.setState({ posts });
        } catch (error) {
            console.error(error);
        }
    };

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert("Something went wrong!");
        console.error(error);
        console.error(info);
    }

    render() {
        return (
            <div style={{ padding: "20px" }}>
                <h1>Blog Posts</h1>

                {this.state.posts.map(post => (
                    <div
                        key={post.id}
                        style={{
                            border: "1px solid gray",
                            marginBottom: "15px",
                            padding: "10px",
                            borderRadius: "5px"
                        }}
                    >
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
                {/* {this.state.posts.map(post => (
                    <PostItem key={post.id} post={post} />
                    ))}  */}
            </div>
        );
    }
}

export default Posts;