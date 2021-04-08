import React, {useState, useEffect} from 'react';
import {Route, Switch} from 'react-router-dom';
import Request from '../helpers/request';
import MenuItemList from '../components/MenuItemList';


const MenuItemContainer  = () => {
    const [menuItems, setMenuItems] = useState([]);
    const[selectedMenuItem, setSelectedMenuItem] = useState(null)

    const getMenuItems = () => {
        fetch("api//menu_items/category/{category} ")
        .then((res) => res.json())
        .then((data) => setMenuItems(data.restuarant.menu))
    }
// const requestAll = function(){
//         const request = new Request();
//         const menuItemPromise = request.get('/api/menu_items/category/{category} ')
        
    
//         Promise.all([menuItemPromise])
//         .then((data) => {
//             setMenuItems(data[0])
//         }) }

useEffect(() => {
    getMenuItems();
}, []);


const handleSelectedMenuItems = (menuItem) => {
    setSelectedMenuItem(menuItem)
}

// useEffect(()=>{
// requestAll()
// }, [])




      if(!menuItems){
        return null
      }
  

      return (
        <>
        <Switch>
  
        <Route render={() => {
        return <MenuItemList menuItems={menuItems} onMenuItemSelected={handleSelectedMenuItems}/>
                 }} />
          </Switch>

           </>

        )
  


}

export default MenuItemContainer;