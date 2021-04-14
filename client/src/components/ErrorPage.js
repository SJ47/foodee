import React from 'react';
import Image2 from "../images/Image2.png";
import { Link } from 'react-router-dom';
import '../css/ErrorPage.css';

const ErrorPage = () => {
    return (
        <div className="error-page">

              <h1 className="error-headline">There is a glaring error.</h1>
             <img className="alan-image"src={Image2} alt="Alan P says go home" height="350" width="350"/> 
             <Link to="/home">  <button className="home-btn" type="HOME">GO HOME </button>
            
             Go Home  </Link>
             </div>
    );
}

export default ErrorPage;