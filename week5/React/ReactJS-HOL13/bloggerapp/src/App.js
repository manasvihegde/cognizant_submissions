import React from "react";
import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  // Change this value to test different outputs
  const showBook = true;
  //const showBook = false;
  const showBlog = true;
  //const showBlog = false;
  const showCourse = true;
  //const showCourse = false;

  // Element variable
  let courseComponent;
  if (showCourse) {
    courseComponent = <CourseDetails />;
  }

  // if...else
  if (!showBook && !showBlog && !showCourse) {
    return <h2>No Details Available</h2>;
  }

  return (
    <div style={{ padding: "20px" }}>
      <h1>Blogger App</h1>

      {/* if...else */}
      {showBook ? <BookDetails /> : <h3>Book Details Hidden</h3>}

      <hr />

      {/* Logical && */}
      {showBlog && <BlogDetails />}

      <hr />

      {/* Element Variable */}
      {courseComponent}

    </div>
  );
}

export default App;