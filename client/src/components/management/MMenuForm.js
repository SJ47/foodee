import React, {useState} from 'react';
import {Link} from 'react-router-dom';

const MMenuForm = ({restaurants, categories, onCreate}) => {

const [stateMenuItem, setStateMenuItem] = useState(
    {
        restaurant: null,
        category: null,
        name: "",
        description: "",
        price: null,
        image: "",
        isGlutenFree: false,
        isVegetarian: false,
        isVegan: false,
        isAlcoholic: false,
        size: "",
        abv: null
    }
)

// public MenuItem(Restaurant restaurant, Category category, String name, String description,
//     double price, String image, boolean isGlutenFree, boolean isVegetarian, boolean isVegan,
//     boolean isAlcoholic, String size, double abv) {
// this.restaurant = restaurant;
// this.category = category;
// this.name = name;
// this.description = description;
// this.price = price;
// this.image = image;
// this.isGlutenFree = isGlutenFree;
// this.isVegetarian = isVegetarian;
// this.isVegan = isVegan;
// this.isAlcoholic = isAlcoholic;
// this.size = size;
// this.abv = abv;
// this.allergens = new ArrayList<>();
// this.orders = new ArrayList<>();
// }

const handleChange = function(event){
    let propertyName = event.target.name;
    let copiedItem = {...stateMenuItem}
    copiedItem[propertyName] = event.target.value;
    setStateMenuItem(copiedItem)
}

const handleRestaurant = function(event){
    const index = parseInt(event.target.value)
    const selectedRestaurant = restaurants[index]
    let copiedItem = {...stateMenuItem};
    copiedItem['restaurant'] = selectedRestaurant
    setStateMenuItem(copiedItem)
}

const handleSubmit = function(event){
    event.preventDefault();
    // onCreate(stateMenuItem); 
    // handleFakeItemPost(stateMenuItem);
}

// const handleFakeItemPost = (item) => {
//     const request = new Request();
//     request.post("/menu_items", item)
//         .then(window.alert("Item Saved"))
//         .then(window.location = '/management/menu')
// }

const restaurantOptions = restaurants.map((restaurant, index) => {
    return <option key={index} value={index}>{restaurant.name}</option>
})

if (!restaurants.length === 0){
    return <p>Loading...</p>
    }
  return(
    <>
   
    <div className="menu-form-container">
    <h1 id="add-item-title">Add an Item</h1>
       <form className="add-new-item-form" onSubmit={handleSubmit}>
       <select name="restaurant" onChange={handleRestaurant} defaultValue="select-restaurant">
       <option disabled value='select-restaurant'>Select a restaurant</option>
            {restaurantOptions}
        </select>   
       <select name="category" defaultValue="select-category">
       <option disabled value='select-category'>Select a category</option>
            {/* {categoryOptions} */}
            <option>Main</option>
            <option>Side</option>
            <option>Child Meal</option>
            <option>Snack</option>
            <option>Dessert</option>
            <option>Alcoholic Drink</option>
            <option>Soft Drink</option>
            <option>Hot Drink</option>
        </select>   
       <input type="text" placeholder="Item Name" name="name" onChange={handleChange} value={stateMenuItem.name} />
       <input type="text" placeholder="Description" name="description" onChange={handleChange} value={stateMenuItem.description} />
       <input type="number" placeholder="Price" name="price" onChange={handleChange} value={stateMenuItem.price}/>
       <input type="text" placeholder="Image URL" name="image" onChange={handleChange} value={stateMenuItem.image} />
       <input type="text" placeholder="Size" name="size" onChange={handleChange} value={stateMenuItem.size} />
       <input type="number" placeholder="ABV" name="abv" onChange={handleChange} value={stateMenuItem.abv}/>
       <Link to="/management/menu"><button type="submit">Save</button></Link>
       </form>
    </div>
    </>
  )
}

export default MMenuForm;