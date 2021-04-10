import React, { useEffect, useState } from 'react';
import { Route, Switch } from 'react-router';
import Request from '../helpers/request.js';
import HomePage from '../components/HomePage';
import LoginPage from '../components/LoginPage';
import MenuPage from '../components/MenuPage';
// import TopNavBar from '../components/TopNavBar';

const MainContainer = () => {

    const [currentItems, setCurrentItems] = useState([]);
    const [selectedCategory, setSelectedCategory] = useState("menu_items/category/main")

    useEffect(() => {
        console.log("Fetching menu items...")
        // let categoryUrl = selectedCategory;
        const request = new Request();
        const allItemsPromise = request.get(selectedCategory)

        Promise.all([allItemsPromise])
            .then((data) => {
                setCurrentItems(data[0]);
            })

    }, [selectedCategory])

    if (!currentItems) {
        return <p>nothing</p>
    }

    const handleCategoryNavClick = (category) => {
        setSelectedCategory(category);
    }

    return (
        <>
            {/* HAVE TOPNAVBAR HERE IF YOU WANT IT ON ALL PAGES */}

            <Switch>
                <Route exact path="/login" component={LoginPage} />
                <Route exact path="/home" render={() => {
                    return <HomePage currentItems={currentItems} handleCategoryNavClick={handleCategoryNavClick} />
                }} />
                <Route exact path ="/menu" render={() => {
                    return <MenuPage currentItems={currentItems} handleCategoryNavClick={handleCategoryNavClick}/>
                }} />
            </Switch>
        </>
    )

}

export default MainContainer;