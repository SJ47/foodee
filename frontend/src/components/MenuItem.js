import React from 'react';
import {Link} from 'react-router-dom';


const MenuItem = ({menuItem}) => {

    if (!menuItem){
        return <p>Loading...</p>
      }
    
      const url = "/menu/" + menuItem.id;
    

    return (

        <>
        <Link to ={url} className="category">
        {menuItem.category}
        </Link>   
        <p>Description {menuItem.description} </p>
        <p></p>
        
    </>
    )
}

export default MenuItem;