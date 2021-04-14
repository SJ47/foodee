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
    {item.id}{' - '}{item.name}{' '}<i class="far fa-edit"></i>{' '}<i class="far fa-trash-alt"></i>
    </Link>
    <p>Description: {item.description}</p>
    <p>Price: {item.price}</p>
    <p>Allergens: {item.allergens}</p>
    </>
  )
}

export default MItem;
