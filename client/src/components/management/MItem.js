import React from 'react';
import {Link} from 'react-router-dom';

const MItem = ({item}) => {

  if (!item){
    return <p>Loading...</p>
  }

  const url = "/menu/" + item.id;

  return (
    <>
    <Link to = {url} className="name">
    {item.id}{' - '}{item.name}
    </Link>
    <p>Description: {item.description}</p>
    <p>Price: {item.price}</p>
    <p>Allergens: {item.allergens}</p>
    </>
  )
}

export default MItem;
