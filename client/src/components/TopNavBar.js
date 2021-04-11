import FooDeeLogo from './FooDeeLogo'
import HamburgerLogo from './HamburgerLogo';
import HomeLogo from './HomeButtonLogo';
import BasketLogo from './BasketLogo';
import '../css/SideNavBar.css'

const TopNavBar = () => {
    return (
        <>

        <div className="top-navbar-container-all">
            <div className="top-navbar-container-left">
                <FooDeeLogo></FooDeeLogo>
            </div>
            <div className="top-navbar-container-right">
                <input type="checkbox" className="open-sidebar-menu" id="open-sidebar-menu" />
                <label for="open-sidebar-menu" className="sidebar-icon-toggle">
                    <div class="spinner diagonal part-1"></div>
                    <div class="spinner horizontal"></div>
                    <div class="spinner diagonal part-2"></div>
                </label>
                <div id="sidebar-menu">
                    <ul className="sidebar-menu-inner">
                        <li>
                            PLACEHOLDER 1
                        </li>
                        <li>
                            PLACEHOLDER 2
                        </li>
                    </ul>
                </div>
                    
            </div>
        </div>

        {/* <div className="top-navbar-container-all">
            <div className="top-navbar-container-left">
                <FooDeeLogo></FooDeeLogo>
            </div>
            <div className="top-navbar-container-right">
                <HomeLogo></HomeLogo>
                <BasketLogo></BasketLogo>
                <HamburgerLogo></HamburgerLogo>
            </div>
        </div> */}
        </>
    )

};

export default TopNavBar;