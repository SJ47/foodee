import Checkout from './Checkout';
import HamburgerMenu from './HamburgerMenu';
import BasketLogo from './BasketLogo';
import FooDeeLogo from './FooDeeLogo';


// const TopNavBar = ({ basketCounter }) => {
//     return (
//         <>
//         <HamburgerMenu></HamburgerMenu>
//         </>
//     )
// };

const TopNavBar = ({ basketCounter }) => {
    return (
        <>
            <div className="top-navbar-container-all">
                <div className="top-navbar-container-left">
                </div>
                <div className="top-navbar-container-right">
                    <BasketLogo basketCounter={basketCounter}></BasketLogo>
                    <HamburgerMenu></HamburgerMenu>
                </div>
            </div>
        </>
    )
};

export default TopNavBar;