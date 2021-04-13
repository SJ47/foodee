import HamburgerMenu from './HamburgerMenu';
import BasketLogo from './BasketLogo';
// import "../css/TopNavBar.css"



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
                {/* <BasketLogo basketCounter={basketCounter}></BasketLogo> */}
                <HamburgerMenu></HamburgerMenu>
            

            </div>
        </>
    )
};

export default TopNavBar;