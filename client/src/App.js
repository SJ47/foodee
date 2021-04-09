import './css/App.css';
import { Route, Switch } from 'react-router';
import MainContainer from './containers/MainContainer';
import LoginPage from './components/LoginPage';

function App() {
  return (
    <div className="App">
      <Switch>
        <Route exact path="/" component={MainContainer} />
        <Route exact path="/login" component={LoginPage} />
      </Switch>
    </div>
  );
}

export default App;
