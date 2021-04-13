import React from 'react'
import "../css/HamburgerMenu.css"
import FooDeeLogo from './FooDeeLogo';


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
                <FooDeeLogo></FooDeeLogo>
                <div onClick={handleNavButtonClick} className="hamburger">
                    <div className="line"></div>
                    <div className="line"></div>
                    <div className="line"></div>
                </div>
                <ul className="nav-links">
                    <li><a href="/"><i class="fas fa-home"></i>Home</a></li>
                    <li><a href="/"><i class="fas fa-child"></i>Kids</a></li>
                    <li><a href="/"><i class="fas fa-map-marker-alt"></i>Contact</a></li>
                </ul>
            </nav>
        </div>
    )

}

export default HamburgerMenu