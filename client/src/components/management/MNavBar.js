import FooDeeLogo from '../FooDeeLogo';
import '../../css/TopNavBar.css';
import { Link } from 'react-router-dom';

const TopNavBar = () => {
    return (
        <>
        <div className="top-navbar-container-all">
            <div className="top-navbar-container-left">
                <FooDeeLogo></FooDeeLogo>
            </div>
            <div className="top-navbar-container-right">
                <Link to="/management/home" className="admin-link">Home</Link>{' '}
                <Link to="/management/menu" className="admin-link">Menu</Link>{' '}
                <Link className="admin-link">Tables</Link>{' '}
                <Link className="admin-link">Customers</Link>{' '}
                <Link className="admin-link">Orders</Link>{' '}
                <Link className="admin-link">Finance</Link>
            </div>
        </div>
        </>
    )

};

export default TopNavBar;