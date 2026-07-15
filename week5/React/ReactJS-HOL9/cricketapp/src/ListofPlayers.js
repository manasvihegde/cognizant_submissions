import React from 'react';

const players = [
  { name: 'Virat', score: 85 },
  { name: 'Rohit', score: 45 },
  { name: 'Rahul', score: 60 },
  { name: 'Dhawan', score: 78 },
  { name: 'Pant', score: 30 },
  { name: 'Jadeja', score: 55 },
  { name: 'Bumrah', score: 15 },
  { name: 'Shami', score: 20 },
  { name: 'Ashwin', score: 40 },
  { name: 'Kohli', score: 90 },
  { name: 'Gill', score: 75 }
];

function ListofPlayers() {
  return (
    <div>
      <h1>List of Players</h1>

      {players.map((player) => (
        <li key={player.name}>
          {player.name} - {player.score}
        </li>
      ))}
    </div>
  );
}

function Scorebelow70() {
  const filteredPlayers = players.filter(
    player => player.score <= 70
  );

  return (
    <div>
      <h1>Players with Score ≤ 70</h1>

      {filteredPlayers.map((player) => (
        <li key={player.name}>
          {player.name} - {player.score}
        </li>
      ))}
    </div>
  );
}

export { ListofPlayers, Scorebelow70 };