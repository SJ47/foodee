import React from 'react';
// import {Link} from 'react-router-dom';

const MItem = ({item}) => {

  if (!item){
    return <p>Loading...</p>
  }

//   const url = "/menu/" + item.id;

  return (
    <>

    <h4>Table #{item.tableNumber}</h4>
    <p>Capacity: {item.capacity}</p>
    <p>{item.customers.length === 0 ? 
    "FREE" : "OCCUPIED"}
    {/* add code about table customers but for now needs fixing tables in backend */}
    </p>
    </>
  )
}

export default MItem;