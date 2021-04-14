import MItem from './MItem';
import MNavBar from './MNavBar';
import './admin.css'
import {Link} from 'react-router-dom';

const MMenu = ({menu, restaurants}) => {
    
    const itemNodes = menu.map((item, index) => {
        return (
            <li key={index} className="component-item">
                <div className="component">
                    <MItem item={item} />
                </div>
            </li>
        )
    })

    return (
        <>
        <MNavBar/>
        <div className="admin-menu">
            <h1>Menu</h1>
            <Link to="/management/menu/new"><h4>Add a new item to menu</h4></Link>
                <ul className="component-list">
                    {itemNodes}
                </ul>
        </div>
        </>
    )
    
}
    
export default MMenu;