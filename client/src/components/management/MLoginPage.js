import '../../css/LoginPage.css'
import MLoginForm from './MLoginForm';

const MLoginPage = ({handleCustomerLogIn, handleCustomerPost}) => {
    
    return (
        <div className="login-page">
            <MLoginForm handleCustomerLogIn={handleCustomerLogIn} handleCustomerPost={handleCustomerPost}/>
        </div>
    )
    
    }
    
    export default MLoginPage;