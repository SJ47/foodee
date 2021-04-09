import './App.css';
import { Route, Switch } from 'react-router';
import TestContainer from './containers/TestContainer';

function App() {
  return (
    <div className="App">
      <Switch>
        <Route exact path="/" component={TestContainer} />
      </Switch>
    </div>
  );
}

export default App;
