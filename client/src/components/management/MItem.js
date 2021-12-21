import React from 'react';
import { Link } from 'react-router-dom';

const MItem = ({ item }) => {

  const textAllergen = () => {
    let text = [];
    // const allergensMap = item.allergens.map((allergen) => {
    //   text.push(allergen.toLowerCase());
    // })
    return text.join(", ")
  }

  if (!item) {
    return <p>Loading...</p>
  }

  const url = "/menu/" + item.id;

  return (
    <>
      <Link to={url} className="name">
        {item.id}{' - '}{item.name}{' '}<i className="far fa-edit"></i>{' '}<i className="far fa-trash-alt"></i>
      </Link>
      <p>Description: {item.description}</p>
      <p>Price: {item.price}</p>
      {/* <p>Allergens: {item.allergens}</p> */}
      <p>Allergens: {textAllergen()}</p>
    </>
  )
}

export default MItem;
