import React from 'react'
import "../css/HamburgerMenu.css"
import FooDeeLogo from './FooDeeLogo'
import { Link } from 'react-router-dom';


const HamburgerMenu = () => {

    const handleNavButtonClick = () => {
        const navLinks = document.querySelector(".nav-links");
        const links = document.querySelectorAll(".nav-links li");
        navLinks.classList.toggle("open");
        links.forEach(link => {
            link.classList.toggle("fade");
        });
    }

    return (
        <div className="top-navbar-container-all">
            <nav>
                <FooDeeLogo></FooDeeLogo>
                <div onClick={handleNavButtonClick} className="hamburger">
                    <div className="line"></div>
                    <div className="line"></div>
                    <div className="line"></div>
                </div>

                <ul className="nav-links">
                    <li><Link to="/home"><i className="fas fa-home"></i>Home</Link></li>
                    <li><Link to="/menu"><i className="fas fa-utensils"></i>Menu</Link></li>
                    <li><Link to="/about"><i className="fas fa-map-marker-alt"></i>About Us</Link></li>
                    <li><Link to="/about"><i className="fas fa-child"></i>Kids</Link></li>

                    {/* Not a Link so we lose the state and default back to false */}
                    <li><a href="/login"><i className="fas fa-sign-out-alt"></i>Log out</a></li>
                </ul>

            </nav>
        </div>
    )

}

export default HamburgerMenu