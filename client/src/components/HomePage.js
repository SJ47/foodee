import TopNavBar from '../components/TopNavBar';
import '../css/homePage.css';
import { Link } from 'react-router-dom';

const HomePage = ({ handleCategoryNavClick, handleCustomerLogIn }) => {

    // Ensure customer is logged in as they are in the app now
    handleCustomerLogIn();

    return (
        <>
            <div id="home-page-container">
                <TopNavBar />
                <div className="homepage-intro-text">

                    <h1>Welcome to Boules au Mur</h1>
                    <p>In our kitchen we have a passion for food. We use fresh local produce from small independent suppliers. The local butcher supplies the meat, and the local baker bakes our fresh Artisan bread. <br></br><br></br> Children are catered for with a special Menu or can choose smaller portions from the main menu.</p>
                </div>
                <div className="homepage-button">
                    <Link to="/menu" id="menu-button" onClick={() => { handleCategoryNavClick("menu_items/category/main") }}><button type="submit">MENU</button></Link>
                    {/* <Link to="/about" id="about-button"><button type="submit">ABOUT</button></Link> */}
                </div>
            </div>
        </>
    )

};

export default HomePage;