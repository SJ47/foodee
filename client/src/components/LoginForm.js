import React, {useState} from 'react';
import '../css/LoginForm.css';
import Request from '../helpers/request';

const LoginForm = () => {
    
    const [stateCustomer, setStateCustomer] = useState(
        {
            firstName: "",
            lastName: "",
            email: ""
        }
    )

    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedCustomer = {...stateCustomer}
        copiedCustomer[propertyName] = event.target.value;
        setStateCustomer(copiedCustomer)
    }

    // Can be moved then passed down later /////////
    const handleCustomerPost = function(customer){
        const request = new Request();
        request.post("/customers", customer)
        .then(() => window.location = '/home')
        // change '/' to whichever route the home page is called
      }
    ///////////////////////////////////////////////

    const handleSubmit = function(event){
        event.preventDefault();
        handleCustomerPost(stateCustomer); 
    }

    return (
        <>
            <form className="login-form" onSubmit={handleSubmit}>
                <input type="text" placeholder="First Name" name="firstName" onChange={handleChange} value={stateCustomer.firstName} />
                <input type="text" placeholder="Last Name" name="lastName" onChange={handleChange} value={stateCustomer.lastName} />
                <input type="email" placeholder="email" name="email" onChange={handleChange} value={stateCustomer.age}/>
                <button type="submit">Save</button>
            </form>
        </>
    )

}

export default LoginForm;