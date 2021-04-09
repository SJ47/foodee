import React, {useEffect, useState} from 'react';
import { Route, Switch } from 'react-router';
import TestList from '../components/TestList';
import Request from '../helpers/request.js';

const TestContainer = () => {

    const [allItems, setAllItems] = useState([]);


    const getAllItems = () => {
        console.log("Fetching all items...")
        const request = new Request();
        const allItemsPromise =  request.get('/menu_items/')

        Promise.all([allItemsPromise])
        .then((data) => {
            setAllItems(data[0]);
        })

    }

    useEffect(() => {
        getAllItems()
    }, [])

    if(!allItems){
        return <p>nothing</p>
    }

    return (
        <>
        <Switch>
            <Route render={() => {
                return <TestList allItems={allItems} />
            }} />
        </Switch>
        </>
    )

}

export default TestContainer;