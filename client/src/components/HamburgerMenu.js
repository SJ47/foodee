import React from 'react'
import "../css/HamburgerMenu.css"
import FooDeeLogo from './FooDeeLogo'
import HomeLogo from './HomeButtonLogo';
import BasketLogo from './BasketLogo'

const HamburgerMenu = () => {

    const hamburger = document.querySelector(".hamburger");
    const navLinks = document.querySelector(".nav-links");
    const links = document.querySelectorAll(".nav-links li");


    const handleNavButtonClick = () => {
        navLinks.classList.toggle("open");
        links.forEach(link => {
            link.classList.toggle("fade");
        });
    }

    return (
        <div>
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
                    <li><a href="/">Find Us</a></li>
                    <li><a href="/">Kids</a></li>
                    <li><a href="/">Contact</a></li>
                </ul>
            </nav>
        </div>
    )

}

export default HamburgerMenu