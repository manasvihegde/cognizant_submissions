import './App.css';
import CohortDetails from './CohortDetails';

const cohorts = [
  {
    name: 'Java FSE',
    status: 'ongoing',
    startDate: '10-Jul-2026'
  },
  {
    name: 'ReactJS',
    status: 'completed',
    startDate: '15-May-2026'
  },
  {
    name: 'Spring Boot',
    status: 'ongoing',
    startDate: '01-Jun-2026'
  }
];

function App() {
  return (
    <div>
      <h1>Cohort Details</h1>

      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;