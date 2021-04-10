const MenuItemList = ({ currentItems, category, handleSelectedItemAdd, handleSelectedItemRemove, basket, basketValue }) => {

    const menuListItems = currentItems.map((item, index) => {
        return <li className="menu-list-item" key={index}>
            <div>
                <h3>{item.name}</h3>
                <p><em>{item.description}</em></p>
                <h3>£{item.price}</h3>
                <button
                    onClick={() => { handleSelectedItemRemove(item) }}
                    className="btn minus-button">-
                </button>
                <div className="item-quantity">Qty: <span className="item-quantity-value">{basket.length}</span></div>
                <button
                    onClick={() => { handleSelectedItemAdd(item) }}
                    className="btn plus-button">+
                    </button>

            </div>
            <div className="item-info-container">
                <img src={item.image} alt="" width="200px" height="200px" />
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