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
                    <p><em>{item.description}</em>&nbsp;</p>
                    <p className="food-req-icons">
                        {item.vegan ? "VE" : null}{' '}
                        {item.vegetarian ? "VG": null}{' '}
                        {item.glutenFree ? "GF" : null}
                    </p>
                </div>
                    
                <h3>£{item.price}</h3>
                <button
                    onClick={() => { handleSelectedItemRemove(item) }}
                    className="btn minus-button">-
                </button>

                <div className="item-quantity"><span className="item-quantity-value">{item.quantity}</span></div>
                <button
                    onClick={() => { handleSelectedItemAdd(item) }}
                    className="btn plus-button">+
                    </button>

            </div>
            <div className="item-info-container">
                <img src={item.image} alt=""/>
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