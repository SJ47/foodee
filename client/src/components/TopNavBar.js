import FooDeeLogo from './FooDeeLogo'
import HamburgerLogo from './HamburgerLogo';
import HomeLogo from './HomeButtonLogo';
import BasketLogo from './BasketLogo';
import HamburgerMenu from './HamburgerMenu';

const TopNavBar = ({ basketCounter }) => {
    return (
        <>
        
        <div className="top-navbar-container-all">
            <div className="top-navbar-container-left">
                {/* <FooDeeLogo></FooDeeLogo> */}
            </div>
            <div className="top-navbar-container-right">
                {/* <HomeLogo></HomeLogo>
                <BasketLogo></BasketLogo> */}
                {/* <HamburgerLogo></HamburgerLogo> */}
                
            </div>
        </div>
        <HamburgerMenu></HamburgerMenu>
        {/* <HamburgerMenu></HamburgerMenu> */}
        </>
    )

};

export default TopNavBar;