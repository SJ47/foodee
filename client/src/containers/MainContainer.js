import React, {useEffect, useState} from 'react';
import { Route, Switch } from 'react-router';
import Request from '../helpers/request.js';
import MenuItemList from '../components/MenuItemList';
import HomePage from '../components/HomePage';

const MainContainer = () => {

    const [currentItems, setCurrentItems] = useState([]);

    const getCurrentItems = () => {
        console.log("Fetching menu items...")
        let categoryUrl = '/menu_items/'
        const request = new Request();
        const allItemsPromise =  request.get(categoryUrl)



        Promise.all([allItemsPromise])
        .then((data) => {
            setCurrentItems(data[0]);
        })

    }

    useEffect(() => {
        getCurrentItems()
    }, [])

    if(!currentItems){
        return <p>nothing</p>
    }

    return (
        <>
        
        <nav>
            <HomePage/>
        </nav>
        <Switch>
            <Route render={() => {
                return <MenuItemList currentItems={currentItems} />
            }} />

        </Switch>
        </>
    )

}

export default MainContainer;