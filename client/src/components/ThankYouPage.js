import React from "react";
import {Link} from "react-router-dom";
import '../css/ThankYouPage.css';


const ThankYouPage = () => {

    return (
    <>
    <div className="thank-you-page">

        <h1 className="large-text-thanks">Thank you for your order</h1>

        <Link to="/home">
                    <button className="home-btn" type="submit">Go to Home Page</button>
         </Link>



    </div>

    </>
    )
}

export default ThankYouPage;