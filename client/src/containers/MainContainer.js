import React, { useEffect, useState } from 'react';
import { Route, Switch, Redirect } from 'react-router';
import Request from '../helpers/request.js';
import HomePage from '../components/HomePage';
import LoginPage from '../components/LoginPage';
import MenuPage from '../components/MenuPage';
import OrderPage from '../components/OrderPage';

// import TopNavBar from '../components/TopNavBar';

const MainContainer = () => {

    const [currentItems, setCurrentItems] = useState([]);
    const [selectedCategory, setSelectedCategory] = useState('/menu_items/category/main')

    const [mains, setMains] = useState([]);
    const [sides, setSides] = useState([]);
    const [desserts, setDesserts] = useState([]);
    const [snacks, setSnacks] = useState([]);
    const [childrenMeals, setChildrenMeals] = useState([]);
    const [hotDrinks, setHotDrinks] = useState([]);
    const [softDrinks, setSoftDrinks] = useState([]);
    const [hardDrinks, setHardDrinks] = useState([]);

    const [basket, setBasket] = useState([])
    const [basketValue, setBasketValue] = useState(0)
    const [loggedIn, setLoggedIn] = useState(false)
    // const [customer, setCustomer] = useState({});

    const requestRestaurantData = function() {
        // for now just menu items
        console.log("Fetching menu items...")
        const request = new Request();
        // const allItemsPromise = request.get(selectedCategory)
        const mainsPromise = request.get('/menu_items/category/main')
        const sidesPromise = request.get('/menu_items/category/side')
        const snacksPromise = request.get('/menu_items/category/snack')
        const dessertsPromise = request.get('/menu_items/category/dessert')
        const childrenMealsPromise = request.get('/menu_items/category/child_meal')
        const hotDrinksPromise = request.get('/menu_items/category/hot_drink')
        const softDrinksPromise = request.get('/menu_items/category/soft_drink')
        const hardDrinksPromise = request.get('/menu_items/category/hard_drink')

        // Promise.all([allItemsPromise])
        // .then((data) => {
        //     setCurrentItems(data[0]);
        // })

        Promise.all([mainsPromise, sidesPromise, snacksPromise, dessertsPromise, childrenMealsPromise, hotDrinksPromise, softDrinksPromise, hardDrinksPromise])
        .then((data) => {
            setMains(data[0]);
            setSides(data[1]);
            setSnacks(data[2]);
            setDesserts(data[3]);
            setChildrenMeals(data[4]);
            setHotDrinks(data[5]);
            setSoftDrinks(data[6]);
            setHardDrinks(data[7]);
        })
    }

    useEffect(() => {
        requestRestaurantData()
    }, [selectedCategory])

    // working but causing dependency warning which goes away if request moved into useeffect, see below commented out
    // useEffect(() => {
    //     requestRestaurantData()  
    // }, [selectedCategory])

    // Working useEffect but may be causing fetching issues
    // useEffect(() => {
    //     console.log("Fetching menu items...")
    //     const request = new Request();
    //     const allItemsPromise = request.get(selectedCategory)

    //     Promise.all([allItemsPromise])
    //         .then((data) => {
    //             setCurrentItems(data[0]);
    //         })

    // }, [selectedCategory])

////////////////////////////////////////////////////////////////////////////////

    // useEffect to update cart value when cart items change
    // useEffect(() => {
    //     console.log("Basket has changed contents")
    //     let total = 0;
    //     total = basket.map((basketItem) => {
    //         return total -= basketItem.price
    //     })
    //     console.log("Basket total: ", basketValue);
    // }, [basket])

    if (!currentItems) {
        return <p>nothing</p>
    }

    const handleCategoryNavClick = (category) => {
        setSelectedCategory(category);
    }

    const handleSelectedItemAdd = (item) => {
        // Update contents of the basket
        // Add a quantity field to the object and append by 1 if already exist
        if (item.quantity) {
            item.quantity += 1;
        } else {
            item.quantity = 1;
        }

        setBasket([...basket, item])

        console.log("Item quantity: ", item.quantity);

        // Update value of basket 
        setBasketValue(basketValue + item.price)
        console.log(basket)
    }

    const handleSelectedItemRemove = (item) => {
        // Update contents of the basket if item qty > 0
        if (!item.quantity) {
            return
        }

        // // Remove item from basket
        const updatedBasket = basket.filter((basketItem) => {
            if (basketItem === item) {
                // Remove item price from basket if item to remove is found
                setBasketValue(basketValue - basketItem.price)
                console.log("basket value: ", basketValue)

            }
            return basketItem !== item
        })
        setBasket(updatedBasket);
        console.log(updatedBasket);
    }

    const handleCustomerLogIn = () => {
        console.log("handle customer login triggered");
        setLoggedIn(true);
    }

    return (
        <>
            {/* HAVE TOPNAVBAR HERE IF YOU WANT IT ON ALL PAGES */}
            <Switch>
                <Route exact path="/" render={() => {
                    return (
                        loggedIn ?
                            <Redirect to="/home" /> :
                            <Redirect to="/login" />
                    )
                }} />
                <Route exact path="/login" render={() => {
                    return <LoginPage handleCustomerLogIn={handleCustomerLogIn} />

                }} />
                {/* <Route exact path="/login" component={LoginPage} /> */}
                <Route exact path="/home" render={() => {
                    return <HomePage handleCategoryNavClick={handleCategoryNavClick} />
                }} />
                <Route exact path="/menu" render={() => {
                    return (
                        <MenuPage currentItems={currentItems}
                            handleCategoryNavClick={handleCategoryNavClick}
                            category={selectedCategory}
                            handleSelectedItemAdd={handleSelectedItemAdd}
                            handleSelectedItemRemove={handleSelectedItemRemove}
                            basket={basket}
                            basketValue={basketValue}
                        />
                    )}} />
                     <Route exact path="/Basket" component={OrderPage}/>

            </Switch>
        </>
    )
}

export default MainContainer;