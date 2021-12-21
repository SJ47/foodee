import React from "react";
import { Link } from "react-router-dom";
import '../css/ThankYouPage.css';
import '../css/animations.css';
import WashingMachine from '../media/PlateYellow.png'

const ThankYouPage = () => {

    return (
        <div className="thank-you-page">

            <h1 className="large-text-thanks">Thank you for your order.<br></br><br></br>We're cooking it now.</h1>
            <div id="washing-machine-container">
                <img id="washing-machine" src={WashingMachine} alt="" />
            </div>

            <Link to="/home">
                <button className="home-btn" type="submit">Home</button>
            </Link>
        </div>
    )
}

export default ThankYouPage;