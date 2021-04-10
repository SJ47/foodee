import React, { useEffect, useState } from 'react';
import { Route, Switch, Redirect } from 'react-router';
import Request from '../helpers/request.js';
import HomePage from '../components/HomePage';
import LoginPage from '../components/LoginPage';
import MenuPage from '../components/MenuPage';
// import TopNavBar from '../components/TopNavBar';

const MainContainer = () => {

    const [currentItems, setCurrentItems] = useState([]);
    const [selectedCategory, setSelectedCategory] = useState("menu_items/category/main")
    const [basket, setBasket] = useState([])
    const [basketValue, setBasketValue] = useState(0)
    const [loggedIn, setLoggedIn] = useState(false)
    // const [customer, setCustomer] = useState({});

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

    const handleSelectedItemAdd = (item) => {
        // Update contents of the basket
        const currentBasket = [...basket, item]
        setBasket(currentBasket)
        console.log("Added item", item)
        console.log("Current basket: ", currentBasket);

        // Update total value of basket
        let currentValue = basketValue;
        currentValue += item.price;
        setBasketValue(currentValue);
        console.log("Current basket Value: ", currentValue);
    }

    const handleSelectedItemRemove = (item) => {
        console.log("Removed item", item)
    }

    return (
        <>
            {/* HAVE TOPNAVBAR HERE IF YOU WANT IT ON ALL PAGES */}
            <Switch>
{/*                
                <Route exact path="/" render={() => {
                    return(
                        loggedIn={loggedIn} ? 
                        <Redirect to="/home" />:
                        <Redirect to="/login"/> )}  */}
                
                <Route exact path="/" render={() => {
                    return (
                        loggedIn?
                        <Redirect to="/home"/>:
                        <Redirect to="/login"/>   
                    )}}/>
                <Route exact path="/login" component={LoginPage} />
                <Route exact path="/home" render={() => {
                    return <HomePage currentItems={currentItems} handleCategoryNavClick={handleCategoryNavClick}/>
                }} />
                <Route exact path="/menu" render={() => {
                    return (
                        <MenuPage currentItems={currentItems} 
                        handleCategoryNavClick={handleCategoryNavClick}
                        category={selectedCategory}
                        onSelectedItemAdd={handleSelectedItemAdd}
                        onSelectedItemRemove={handleSelectedItemRemove}/>
                    )}} />
            </Switch>
        </>
    )
}

export default MainContainer;