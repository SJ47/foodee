// import MTable from './MTable';
import MNavBar from './MNavBar';

const MCustomerList = ({customers}) => {
    
    // const itemNodes = customers.map((item, index) => {
    //     return (
    //         <li key={index} className="component-item">
    //             <div className="component">
    //                 <MTable item={item} />
    //             </div>
    //         </li>
    //     )
    // })

    return (
        <>
        <MNavBar/>
        <h1>Registered customers</h1>
        {/* <ul className="component-list">
            {itemNodes}
        </ul> */}
        </>
    )
    
}
    
export default MCustomerList;