import '../css/LoginPage.css'
import LoginForm from './LoginForm';

const LoginPage = ({handleCustomerLogIn, handleCustomerPost}) => {
    
    return (
        <div className="login-page">
            <p>I am the login page</p>
            <h1>[logo placeholder]</h1>
            <LoginForm handleCustomerLogIn={handleCustomerLogIn} handleCustomerPost={handleCustomerPost}/>
        </div>
    )
    
    }
    
    export default LoginPage;