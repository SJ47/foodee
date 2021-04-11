import FooDeeLogo from './FooDeeLogo'
import HamburgerLogo from './HamburgerLogo';
import HomeLogo from './HomeButtonLogo';
import BasketLogo from './BasketLogo';
import SideNavBar from '../components/SideNavBar';

const TopNavBar = () => {
    return (
        <>
        <div className="top-navbar-container-all">
            <div className="top-navbar-container-left">
                <FooDeeLogo></FooDeeLogo>
            </div>
            <div className="top-navbar-container-right">
                <HomeLogo></HomeLogo>
                <BasketLogo></BasketLogo>
                <HamburgerLogo></HamburgerLogo>
                <SideNavBar />
            </div>
        </div>
        </>
    )

};

export default TopNavBar;