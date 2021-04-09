import './css/App.css';
import { Route, Switch } from 'react-router';
import MainContainer from './containers/MainContainer';
import LoginPage from './components/LoginPage';

function App() {
  return (
    <div className="App">
      <MainContainer/>
    </div>
  );
}

export default App;
