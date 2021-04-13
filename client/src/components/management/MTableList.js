import MTable from './MTable';
import MNavBar from './MNavBar';

const MTableList = ({tables}) => {
    
    const itemNodes = tables.map((item, index) => {
        return (
            <li key={index} className="component-item">
                <div className="component">
                    <MTable item={item} />
                </div>
            </li>
        )
    })

    return (
        <>
        <MNavBar/>
        <div className="admin-tables admin-page">
        <h1>Tables</h1>
        <ul className="component-list">
            {itemNodes}
        </ul>
        </div>
        </>
    )
    
}
    
export default MTableList;