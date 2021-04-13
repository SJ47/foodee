// import MTable from './MTable';
import MNavBar from './MNavBar';
import './admin.css'

const MCustomerList = ({customers}) => {
    
    const customerList = customers.map((customer, index) => {
        return (
            <tr key={index}>
                <td>{customer.id}</td>
                <td>{customer.firstName}</td>
                <td>{customer.lastName}</td>
                <td>{customer.email}</td>
            </tr>
        )
    })

    return (
        <>
        <MNavBar/>

        <div className="admin-customers admin-page">
            <h1>Registered customers</h1>
            <table className="order-table">
                <thead>
                    <tr>
                        <th>Customer #</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    {customerList}
                </tbody>    
            </table>
        </div>

        </>
    )
    
}
    
export default MCustomerList;