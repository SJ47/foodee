import React, { useState } from 'react';
import '../../css/LoginPage.css';

const MLoginForm = ({ handleAdminLogIn, handleAdminPost }) => {

    const [stateAdmin, setStateAdmin] = useState(
        {
            username: "",
            password: ""
        }
    )

    const handleChange = function (event) {
        let propertyName = event.target.name;
        let copiedAdmin = { ...stateAdmin }
        copiedAdmin[propertyName] = event.target.value;
        setStateAdmin(copiedAdmin)
    }

    const handleSubmit = function (event) {
        event.preventDefault();
        handleAdminLogIn();

    }

    return (
        <>
            <form className="login-form" onSubmit={handleSubmit}>
                <input type="text" placeholder="Username" name="username" onChange={handleChange} value={stateAdmin.username} />
                <input type="password" placeholder="password" name="password" onChange={handleChange} value={stateAdmin.password} />
                <button type="submit">Log in</button>
            </form>
        </>
    )
}

export default MLoginForm;