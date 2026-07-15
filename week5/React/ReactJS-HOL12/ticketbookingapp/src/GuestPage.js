import React from "react";

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest!</h2>

      <h3>Available Flights</h3>

      <ul>
        <li>Bangalore → Delhi</li>
        <li>Mumbai → Chennai</li>
        <li>Hyderabad → Kolkata</li>
      </ul>

      <p>Please login to book tickets.</p>
    </div>
  );
}

export default GuestPage;