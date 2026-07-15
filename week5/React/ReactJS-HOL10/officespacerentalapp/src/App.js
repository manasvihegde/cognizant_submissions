import './App.css';
import officeImage from './office.jpg';

const element = "Office Space";

const offices = [
  {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  },
  {
    Name: "Regus",
    Rent: 65000,
    Address: "Bangalore"
  },
  {
    Name: "WeWork",
    Rent: 55000,
    Address: "Hyderabad"
  }
];

function App() {

  const image = (
    <img
      src={officeImage}
      alt="Office Space"
      width="400"
    />
  );

  return (
    <div style={{ padding: "20px" }}>

      <h1>{element}, at Affordable Range</h1>

      {image}

      <hr />

      {offices.map((office, index) => (

        <div key={index} style={{ marginBottom: "20px" }}>

          <h2>Name: {office.Name}</h2>

          <h3
            style={{
              color: office.Rent <= 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>Address: {office.Address}</h3>

        </div>

      ))}

    </div>
  );
}

export default App;