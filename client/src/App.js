import './css/App.css';
import './css/base.css'
import { Route, Switch } from 'react-router';
import MainContainer from './containers/MainContainer';

function App() {
  return (
    <div className="App">
      <Switch>
        <Route exact path="/" component={MainContainer} />
      </Switch>
    </div>
  );
}

export default App;
