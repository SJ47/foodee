import { Link } from 'react-router-dom';

const MenuCategorySubNavBar = ({ onCategoryNavClick }) => {
    return (
        <div>
            <ul className="category-nav-container">
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/hard_drink") }}>Beers,&nbsp;Wines,&nbsp;Ciders</Link>
                </li>
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/soft_drink") }}>Soft&nbsp;Drinks</Link>
                </li>
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/hot_drink") }}>Coffee&nbsp;Teas</Link>
                </li>
            </ul>
        </div >
    )
}

export default MenuCategorySubNavBar;