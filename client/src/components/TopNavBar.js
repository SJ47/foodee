import FooDeeLogo from './FooDeeLogo'
import HamburgerLogo from './HamburgerLogo';
import HomeLogo from './HomeButtonLogo';
import BasketLogo from './BasketLogo';

const TopNavBar = ({ basketCounter }) => {
    return (
        <>
            <div className="top-navbar-container-all">
                <div className="top-navbar-container-left">
                    <FooDeeLogo></FooDeeLogo>
                </div>
                <div className="top-navbar-container-right">
                    <HomeLogo></HomeLogo>
                    <BasketLogo basketCounter={basketCounter}></BasketLogo>
                    <HamburgerLogo></HamburgerLogo>
                </div>
            </div>
        </>
    )

};

export default TopNavBar;