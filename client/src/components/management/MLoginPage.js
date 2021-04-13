import '../../css/LoginPage.css'
import MLoginForm from './MLoginForm';

const MLoginPage = ({handleAdminLogIn, handleAdminPost}) => {
    
    return (
        <div className="login-page">
            <MLoginForm handleAdminLogIn={handleAdminLogIn} handleAdminPost={handleAdminPost}/>
        </div>
    )
    
    }
    
    export default MLoginPage;