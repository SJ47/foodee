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
    {item.name}
    </Link>
    {/* <p>Age: {item.age}</p>
    <p>Ship: {item.ship.name}</p> */}
    </>
  )
}

export default MItem;
