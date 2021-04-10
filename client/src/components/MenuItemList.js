const MenuItemList = ({ currentItems, category, onSelectedItemAdd, onSelectedItemRemove }) => {

    const menuListItems = currentItems.map((item, index) => {
        return <li className="menu-list-item" key={index}>
            <div>
                <h3>{item.name}</h3>
                <p><em>{item.description}</em></p>
                <h3>£{item.price}</h3>
                <button
                    onClick={() => { onSelectedItemRemove(item) }}
                    className="btn minus-button">-
                </button>
                <div className="item-quantity">Qty: <span className="item-quantity-value">0</span></div>
                <button
                    onClick={() => { onSelectedItemAdd(item) }}
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