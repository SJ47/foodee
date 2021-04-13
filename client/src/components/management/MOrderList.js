import MNavBar from './MNavBar';
import './admin.css'

const MOrderList = ({orders}) => {

    const orderList = orders.map((order, index) => {
        console.log("order items", order.orderItems)
        return(
            <tr key={index}>
                <td>{order.id}</td>
                <td>£{order.total}</td>
                <td>{order.customer.lastName}, {order.customer.firstName}</td>
                <td>{order.customer.table}</td>
            </tr>
        )
    })

    // const itemsFromOrder = orders.map((order, index) => {
    //     order.orderItems.map((item, index) => {
    //         console.log("item", item)
    //         return (
    //             <td>{item.name}</td>
    //         )
    //     })
    // })
    
    return (
        <>
        <MNavBar/>
        <div className="admin-orders admin-page">
        <h1>All orders</h1>

        <table className="order-table">
            <thead>
                <tr>
                    <th>Order #</th>
                    <th>Total Spent</th>
                    <th>Customer</th>
                    <th>Table #</th>
                    {/* <th>Food items</th> */}
                </tr>
            </thead>
            <tbody>
                {orderList}
                {/* {itemsFromOrder} */}
            </tbody>    
        </table>
        </div>
        </>
    )  
}
    
export default MOrderList;