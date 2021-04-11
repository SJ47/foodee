import TopNavBar from '../components/TopNavBar';
import '../css/homePage.css';
import { Link } from 'react-router-dom';

const HomePage = ({handleCategoryNavClick}) => {
    return (
        <>
        <TopNavBar/>
        <div className="homepage-intro-text">
            
            <h1>Hello, and welcome Foodee!</h1>
            <h3>Grab a seat, order some food and drink and have it delivered to your table!</h3>
            Proident aliquip enim nulla aliquip sit labore nisi veniam magna. Fugiat id cillum sunt sunt. Voluptate voluptate reprehenderit elit sunt non et officia. Qui ipsum amet ut cupidatat dolore duis ea aliqua ullamco. Aute sunt cillum est qui aute nulla anim Lorem.

Lorem minim id ad do do labore id laborum aliqua dolore velit tempor. Aliqua culpa quis veniam sint dolore duis et nisi. Officia consequat velit dolore do do laborum deserunt deserunt cillum sit eu.

Occaecat ex adipisicing deserunt reprehenderit. Sunt voluptate velit amet aliqua proident duis dolor in esse ut mollit. Tempor nulla do voluptate pariatur incididunt minim laborum duis sint velit ut magna dolor.

Anim non aute tempor nisi incididunt sunt reprehenderit. Nulla elit dolor exercitation ex Lorem magna est in. Occaecat minim exercitation consequat ea fugiat esse velit.

Reprehenderit incididunt laborum nostrud do irure pariatur sunt ea do. Veniam enim ea do est. Labore minim in occaecat magna excepteur non tempor reprehenderit Lorem eu mollit. Elit eu in laboris laborum labore labore cillum laboris aliqua deserunt laboris aute.
        </div>
        <div className="homepage-button">
            <button><Link to="/menu" onClick={() => { handleCategoryNavClick("menu_items/category/main") }}>MENU</Link></button>
            <button><Link to="/about">ABOUT</Link></button>
        </div>
        </>
    )

};

export default HomePage;