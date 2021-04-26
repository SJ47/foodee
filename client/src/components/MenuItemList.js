import '../css/foodIcons.css'

const MenuItemList = ({ currentItems, category, handleSelectedItemAdd, handleSelectedItemRemove, basket, basketValue }) => {

    const copiedCurrentItems = [...currentItems]

    for (let currentItemCount = 0; currentItemCount < copiedCurrentItems.length; currentItemCount++) {

        for (let count = 0; count < basket.length; count++) {
            if (copiedCurrentItems[currentItemCount].name === basket[count].name) {
                copiedCurrentItems[currentItemCount] = basket[count]
            }
        }

    }

    const menuListItems = copiedCurrentItems.map((item, index) => {
        return <li className="menu-list-item" key={index}>

            <div>
                <h3>{item.name}</h3>

                <div className="description-food-icons-box">
                    <p>{item.description}&nbsp;</p>
                    <span className="food-req-icons">
                        <div id="vegan">{item.vegan ? "VE" : null}{' '}</div>
                        <div id="vegetarian">{item.vegetarian ? "VG" : null}{' '}</div>
                        <div id="gluten-free">{item.glutenFree ? "GF" : null}</div>
                    </span>
                </div>

                <div className="menu-item-attributes">
                    <h3>£{item.price.toFixed(2)}</h3>
                    <i onClick={() => { handleSelectedItemRemove(item) }} className="fa fa-minus-circle" aria-hidden="true"></i>

                    <div className="item-quantity"><span className="item-quantity-value">{item.quantity ? item.quantity : 0}</span></div>
                    <i onClick={() => { handleSelectedItemAdd(item) }} className="fa fa-plus-circle" aria-hidden="true">
                    </i>
                </div>

            </div>
            <div className="item-info-container">
                <img src={item.image} alt="" />
            </div>
        </li>
    })

    return (
        <div>
            <ul className="menu-list-item-container">{menuListItems}</ul>
        </div>
    )
}

export default MenuItemList;