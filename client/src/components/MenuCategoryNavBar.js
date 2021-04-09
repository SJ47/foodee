import React from 'react';
import { Link } from 'react-router-dom';

const MenuCategoryNavBar = ({ onCategoryNavClick }) => {
    return (
        <div>
            <ul className="category-nav-container">
                <li className="category-nav-link" >
                    {/* <Link to="/">Mains</Link> */}


                    <Link to="/" onClick={() => { onCategoryNavClick("menu_items/category/main") }}>Mains</Link>

                </li>
                <li className="category-nav-link" >
                    <Link to="/" onClick={() => { onCategoryNavClick("menu_items/category/side") }}>Side</Link>
                </li>
                <li className="category-nav-link" >
                    Snacks
                </li>
                <li className="category-nav-link" >
                    Desserts
                </li>
                <li className="category-nav-link" >
                    Kids
                </li>
                <li className="category-nav-link" >
                    Drinks
                </li>
            </ul>
        </div >
    )
}

export default MenuCategoryNavBar;
