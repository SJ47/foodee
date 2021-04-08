import React from "react";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import MenuItemContainer from './MenuItemContainer';

const MainContainer = () => {
    return (
    
        <Router>

            <>
            <Switch>
                <Route path="/menu" component={MenuItemContainer} />

            </Switch>

            </>
        </Router>


    )
}


export default MainContainer;