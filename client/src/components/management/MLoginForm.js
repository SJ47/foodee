import React, {useState} from 'react';
import '../../css/LoginPage.css';
import {Link} from 'react-router-dom';


const MLoginForm = ({handleCustomerLogIn, handleCustomerPost}) => {
    
    const [stateAdmin, setStateAdmin] = useState(
        {
            username: "",
            password: ""
        }
    )

    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedAdmin = {...stateAdmin}
        copiedAdmin[propertyName] = event.target.value;
        setStateAdmin(copiedAdmin)
    }

    // const handlePost = function(admin){
    //     const request = new Request();
    //     request.post("/admins", admin)
    //     .then(() => window.location = '/management/home')
    // }

    const handleSubmit = function(event){
        event.preventDefault();
        // handlePost(stateAdmin);
        // handleCustomerPost(stateCustomer); 
        // handleCustomerLogIn();

    }

    return (
        <>
            <form className="login-form" onSubmit={handleSubmit}>
                <input type="text" placeholder="Username" name="username" onChange={handleChange} value={stateAdmin.username} />
                <input type="password" placeholder="password" name="password" onChange={handleChange} value={stateAdmin.password} />
                <button type="submit"><Link to="/management/home">Log in</Link></button>
            </form>
        </>
    )

}

export default MLoginForm;