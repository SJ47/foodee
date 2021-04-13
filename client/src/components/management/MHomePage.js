import '../../css/homePage.css';
import MNavBar from './MNavBar';
// import { Link } from 'react-router-dom';

const MHomePage = ({restaurants}) => {

    // const restaurantNodes = restaurants.map((restaurant, index) => {
    //     return (
    //         <p key={index}>
    //             Restaurant name: {restaurant.name}
    //             {/* other info to display about restaurant table */}
    //         </p>
    //     )
    // })

    return (
        <>
        <MNavBar/>
        <div className="admin-homepage admin-page">
            
            <h1>fooDee for Management</h1>
            {/* {restaurantNodes} */}

        </div>

        </>
    )

};

export default MHomePage;