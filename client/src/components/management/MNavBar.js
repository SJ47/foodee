import FooDeeLogo from '../FooDeeLogo';
import './admin.css';
import { Link } from 'react-router-dom';

const TopNavBar = () => {
    return (
        <>
        <div className="Mtop-navbar-container-all">
            <div className="Mtop-navbar-container-left">
                <FooDeeLogo></FooDeeLogo>
            </div>
            <div className="Mtop-navbar-container-right">
                <Link to="/management/home" className="admin-link">Home</Link>{' '}
                <Link to="/management/menu" className="admin-link">Menu</Link>{' '}
                <Link to="/management/tables" className="admin-link">Tables</Link>{' '}
                <Link to="/management/customers" className="admin-link">Customers</Link>{' '}
                <Link to="/management/orders" className="admin-link">Orders</Link>{' '}
                <Link to="/management/finance" className="admin-link">Finance</Link>
            </div>
        </div>
        </>
    )

};

export default TopNavBar;