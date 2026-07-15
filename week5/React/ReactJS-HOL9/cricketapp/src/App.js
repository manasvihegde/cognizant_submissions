import './App.css';
import { ListofPlayers, Scorebelow70 } from './ListofPlayers';
import {
  OddPlayers,
  EvenPlayers,
  ListOfIndianPlayers
} from './IndianPlayers';

function App() {

  const flag = true; // -->output of this will be List of Players and Score below 70
  //const flag = false; -->output of this will be Odd and Even players and Merged Indian Players


  if (flag) {
    return (
      <div>
        <ListofPlayers />
        <hr />
        <Scorebelow70 />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Odd Players</h1>
        <OddPlayers />

        <h1>Even Players</h1>
        <EvenPlayers />

        <h1>Merged Indian Players</h1>
        <ListOfIndianPlayers />
      </div>
    );
  }
}

export default App;