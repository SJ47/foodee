import LoginForm from './LoginForm';
import '../css/LoginPage.css'

const LoginPage = ({handleCustomerLogIn, handleCustomerPost}) => {
    
    return (
        <div className="login-page">
            <LoginForm handleCustomerLogIn={handleCustomerLogIn} handleCustomerPost={handleCustomerPost}/>
        </div>
    )
    
    }
    
    export default LoginPage;