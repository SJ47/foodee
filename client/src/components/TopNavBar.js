import FooDeeLogo from '../components/FooDeeLogo';
import HamburgerMenu from './HamburgerMenu';
import ShoppingBasket from './ShoppingBasket';

const TopNavBar = () => {
    return (
        <>
            <div className="top-nav-bar-container">
                <FooDeeLogo></FooDeeLogo>
                <ShoppingBasket></ShoppingBasket>
                <HamburgerMenu></HamburgerMenu>

            </div>
            {/* <hr /> */}
        </>
    )

};

export default TopNavBar;