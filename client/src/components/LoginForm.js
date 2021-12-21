import React, { useState } from 'react';
import '../css/LoginPage.css';
import '../css/fooDeeLogoAnimation.css';
import '../css/animations.css';
import fork from '../media/fork.png'
import knife from '../media/knife.png'

const LoginForm = ({ handleCustomerLogIn, handleCustomerPost }) => {

    const [stateCustomer, setStateCustomer] = useState(
        {
            firstName: "",
            lastName: "",
            email: ""
        }
    )

    const handleChange = function (event) {
        let propertyName = event.target.name;
        let copiedCustomer = { ...stateCustomer }
        copiedCustomer[propertyName] = event.target.value;
        setStateCustomer(copiedCustomer)
    }


    const handleSubmit = function (event) {
        event.preventDefault();
        handleCustomerPost(stateCustomer);
        handleCustomerLogIn();
    }

    return (
        <>
            <div id="foodee-container">
                <div id="foo">
                    <h1>foo</h1>
                </div>
                <div id="dee">
                    <h1>Dee</h1>
                </div>
            </div>
            <div id="f-k-container">

                <div>
                    <img id="knife" src={knife} alt="" />
                </div>
                <div>
                    <img id="fork" src={fork} alt="" />
                </div>

            </div>
            <form className="login-form" onSubmit={handleSubmit}>
                <input type="text" placeholder="First Name" name="firstName" onChange={handleChange} value={stateCustomer.firstName} />
                <input type="text" placeholder="Last Name" name="lastName" onChange={handleChange} value={stateCustomer.lastName} />
                <input type="email" placeholder="email" name="email" onChange={handleChange} value={stateCustomer.age} />
                <button type="submit">ENTER</button>
            </form>
        </>
    )

}

export default LoginForm;