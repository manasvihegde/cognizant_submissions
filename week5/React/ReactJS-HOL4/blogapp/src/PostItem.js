import React, { Component } from "react";

class PostItem extends Component {
    render() {
        const { post } = this.props;

        // Intentional error for demonstration
        post.someMethodThatDoesNotExist();

        return (
            <div>
                <h2>{post.title}</h2>
                <p>{post.body}</p>
            </div>
        );
    }
}

export default PostItem;