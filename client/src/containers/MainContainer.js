import React, { useEffect, useState } from 'react';
import { Route, Switch } from 'react-router';
import Request from '../helpers/request.js';
import MenuItemList from '../components/MenuItemList';
import HomePage from '../components/HomePage';
import LoginPage from '../components/LoginPage';
import MenuCategoryNavBar from '../components/MenuCategoryNavBar';
import TopNavBar from '../components/TopNavBar.js';

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

            <header>
                {/* <TopNavBar /> */}
                {/* <Switch>
                    <Route> */}
                <MenuCategoryNavBar onCategoryNavClick={handleCategoryNavClick} />
                {/* </Route>
                </Switch> */}
            </header>
            <main>
                <MenuItemList currentItems={currentItems} category={selectedCategory} />
            </main>

            {/* <Switch>
                <Route render={() => {
                    return <MenuItemList currentItems={currentItems} />
                }} />
                <Route exact path="/login" component={LoginPage} />
                <Route exact path="/home" component={HomePage} />
            </Switch> */}
        </>
    )

}

export default MainContainer;