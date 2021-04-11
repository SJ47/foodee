import React from 'react';
import { Link } from 'react-router-dom';

const MenuCategoryNavBar = ({ onCategoryNavClick }) => {
    return (
        <div id="cat-nav-container-buffer">
            <ul className="category-nav-container">
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/main") }}>Mains</Link>
                </li>
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/side") }}>Side</Link>
                </li>
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/snack") }}>Snacks</Link>
                </li>
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/dessert") }}>Desserts</Link>
                </li>
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/child_meal") }}>Kids</Link>
                </li>
                <li className="category-nav-link" >
                    <Link to="/menu" onClick={() => { onCategoryNavClick("menu_items/category/hard_drink") }}>Drinks</Link>
                </li>
            </ul>
        </div >
    )
}

export default MenuCategoryNavBar;
