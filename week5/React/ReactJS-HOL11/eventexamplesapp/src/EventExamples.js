import React, { Component } from "react";

class EventExamples extends Component {

  constructor(props) {
    super(props);

    this.state = {
      counter: 0,
      message: "",
      clickMessage: ""
    };

    this.handleIncrement = this.handleIncrement.bind(this);
    this.handleDecrement = this.handleDecrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleClick = this.handleClick.bind(this);
  }

  handleIncrement() {
    this.setState({
      counter: this.state.counter + 1
    });

    this.sayHello();
  }

  handleDecrement() {
    this.setState({
      counter: this.state.counter - 1
    });
  }

  sayHello() {
    this.setState({
      message: "Hello! Counter increased."
    });
  }

  sayWelcome(name) {
    alert("Welcome " + name);
  }

  handleClick(event) {
    this.setState({
      clickMessage: "I was clicked!"
    });
  }

  render() {
    return (
      <div style={{ padding: "20px" }}>

        <h1>Counter : {this.state.counter}</h1>

        <button onClick={this.handleIncrement}>
          Increment
        </button>

        <button onClick={this.handleDecrement}>
          Decrement
        </button>

        <p>{this.state.message}</p>

        <button onClick={() => this.sayWelcome("Manasvi")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.handleClick}>
          OnPress
        </button>

        <p>{this.state.clickMessage}</p>

        <CurrencyConvertor />

      </div>
    );
  }
}

class CurrencyConvertor extends Component {

  constructor(props) {
    super(props);

    this.state = {
      rupees: "",
      euro: ""
    };

    this.handleChange = this.handleChange.bind(this);
    this.convertCurrency = this.convertCurrency.bind(this);
  }

  handleChange(event) {
    this.setState({
      rupees: event.target.value
    });
  }

  convertCurrency() {

    const euro = (this.state.rupees / 90).toFixed(2);

    this.setState({
      euro: euro
    });
  }

  render() {
    return (
      <div>

        <h2>Currency Convertor</h2>

        <input
          type="number"
          placeholder="Enter INR"
          value={this.state.rupees}
          onChange={this.handleChange}
        />

        <button onClick={this.convertCurrency}>
          Convert
        </button>

        <h3>
          Euro : {this.state.euro}
        </h3>

      </div>
    );
  }
}

export default EventExamples;   