const MenuItemList = ({ currentItems }) => {

    const menuListItems = currentItems.map((item, index) => {
        return <li key={index}>{item.name}</li>
    })

    return (
        <div>
            <ul>{menuListItems}</ul>
        </div>
    )

}

export default MenuItemList;