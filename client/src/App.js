import './css/App.css';
import './css/base.css'
import MainContainer from './containers/MainContainer';
import LoginPage from './components/LoginPage';
import { Route, Switch } from 'react-router';
import TopNavBar from './components/TopNavBar';
import HomePage from './components/HomePage';

function App() {
  return (
    <div className="App">
      <TopNavBar />

      <Switch>
        <Route exact path="/">
          <LoginPage />
        </Route>
        <Route exact path="/home">
          {/* <TopNavBar /> */}
          <HomePage />
        </Route>
        <Route exact path="/menu">
          <MainContainer />
        </Route>
      </Switch>
    </div>
  );
}

export default App;
