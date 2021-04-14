import React from 'react';
import error from "../media/error.png";
import { Link } from 'react-router-dom';
import '../css/ErrorPage.css';

const ErrorPage = () => {
    return (
        <div className="error-page">

              <h1 className="error-headline">That's a glaring error.</h1>
             <img className="alan-image"src={error} alt="Alan P says go home" height="350" width="350"/> 
             <Link to="/home">  <button className="home-btn" type="HOME">GO HOME </button></Link>
             </div>
    );
}

export default ErrorPage;