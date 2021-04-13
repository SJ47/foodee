import React from 'react'
import "../css/HamburgerMenu.css"
import FooDeeLogo from './FooDeeLogo'
import {Link} from 'react-router-dom';


const HamburgerMenu = () => {

    // const hamburger = document.querySelector(".hamburger");
    // const navLinks = document.querySelector(".nav-links");
    // const links = document.querySelectorAll(".nav-links li");


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
                <div>
            <FooDeeLogo></FooDeeLogo>

            </div>

                <div onClick={handleNavButtonClick} className="hamburger">
                    <div className="line"></div>
                    <div className="line"></div>
                    <div className="line"></div>
                </div>
                <ul className="nav-links">
                    {/* <li><a href="/home"><i class="fas fa-home"></i>Home</a></li> */}
                    {/* <li><a href="/"><i class="fas fa-child"></i>Kids</a></li> */}
                    {/* <li><a href="/"><i class="fas fa-map-marker-alt"></i>Log out</a></li> */}

                    <li><Link to="/home"><i class="fas fa-home"></i>Home</Link></li>
                    <li><Link to="/menu"><i class="fas fa-utensils"></i>Menu</Link></li>
                    <li><Link to="/about"><i class="fas fa-map-marker-alt"></i>About Us</Link></li>
                    <li><Link ><i class="fas fa-child"></i>Kids</Link></li>

                    {/* Not a Link so we lose the state and default back to false */}
                    <li><a href="/login"><i class="fas fa-sign-out-alt"></i>Log out</a></li>
                </ul>

            </nav>
        </div>
    )

}

export default HamburgerMenu