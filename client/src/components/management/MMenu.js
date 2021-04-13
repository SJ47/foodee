import MItem from './MItem';
import MNavBar from './MNavBar';

const MMenu = ({menu}) => {
    
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
            <ul className="component-list">
                {itemNodes}
            </ul>
        </div>
        </>
    )
    
}
    
export default MMenu;