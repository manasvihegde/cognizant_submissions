import React from 'react';

const indianTeam = [
  'Virat',
  'Rohit',
  'Rahul',
  'Gill',
  'Pant',
  'Jadeja'
];

export function OddPlayers() {
  const [first, , third, , fifth] = indianTeam;

  return (
    <div>
      <li>{first}</li>
      <li>{third}</li>
      <li>{fifth}</li>
    </div>
  );
}

export function EvenPlayers() {
  const [, second, , fourth, , sixth] = indianTeam;

  return (
    <div>
      <li>{second}</li>
      <li>{fourth}</li>
      <li>{sixth}</li>
    </div>
  );
}

const T20Players = ['Virat', 'Rohit', 'Gill'];
const RanjiPlayers = ['Pant', 'Jadeja', 'Rahul'];

export const IndianPlayers = [
  ...T20Players,
  ...RanjiPlayers
];

export function ListOfIndianPlayers() {
  return (
    <div>
      {IndianPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </div>
  );
}