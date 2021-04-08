import React from 'react';
import MenuItem from './MenuItem.js';


const MenuItemList = ({menuItems}) => {
    
      const menuItemNodes = menuItems.map((menuItem, index) => {
        return (
          <li className="component-item" key={index}> {menuItems["menu"].category}
       
          <MenuItem menuItem={menuItem} />
         
          </li>
        )
      })
  
      return (

        <>

         <h1>Menu Item List</h1>
        <ul className="component-list">
          {menuItemNodes}
        </ul>

        </>
      )
  }
   export default MenuItemList;
  

