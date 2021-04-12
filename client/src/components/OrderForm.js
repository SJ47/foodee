import React, { useState } from 'react';
import '../css/OrderForm.css';
import { Link } from "react-router-dom"


const OrderForm = ({ customer, basket, basketValue, handleOrderPost }) => {

    const [stateOrder, setStateOrder] = useState(
        {
            customer: { customer },
            specialNotes: "",
            orderItems: { basket },
            quantity: 0,
            total: { basketValue },
            rating: null
            // table: null,

        }
    )


    const handleChange = function (event) {
        let propertyName = event.target.name;
        let copiedOrder = { ...stateOrder }
        copiedOrder[propertyName] = event.target.value;
        setStateOrder(copiedOrder)
    }


    // const handleTable = function(event) {
    //     const index = parseInt(event.target.value)
    //     const SelectedTable = tables[index]
    //     let copiedOrder = {...stateOrder};
    //     copiedOrder['Table'] = SelectedTable
    //     setStateOrder(copiedOrder)
    // }

    // const handlePost = function (order) {
    //     const request = new Request();
    //     request.post("/orders", order)
    //     .then(() => window.location = "/orders")

    // }


    const handleSubmit = function (event) {
        console.log("handleSubmit called")
        event.preventDefault();
        // onCreate(stateOrder); 
        handleOrderPost(stateOrder);
        
        // handleOrderSubmit();
    }



    // const tableOptions = table.map((table, index) => {
    //     return <option key={index} value={index}>{table.number}</option>
    // })

    // if (!TableOptions.length === 0){
    //     return <p>Loading...</p>
    //     }

  



    return (
        <>
             <form onSubmit={handleSubmit}>
                <input type="text" placeholder="special notes" name="specialNotes" onChange={handleChange} value={stateOrder.specialNotes} />
                {/* <select name="table" onChange={handleTable} defaultValue="select-table">
        <option disabled value='select-ship'>Select a Table</option>
            {tableOptions}
        </select>  */}
            <button className="order-btn" type="submit">Pay Now</button>
            </form>
            {/* <Link to="/paymentform" className="checkout-text" basket={basket}>
                    
            </Link> */}
        </>

        //         <i className="fas fa-shopping-cart"></i>
        // <div className="basket-item-count">{qtyInBasket}</div>
        // <button onClick={handlePayment}>
        //     <Link to="/paymentform" className="checkout-text">
        //     CHECKOUT
        //     </Link>
        // </button>
        // <div className="checkout-total">£{basketValue}</div>




    )
}


export default OrderForm;

 // public Order(Customer customer) {
        //     this.customer = customer;
        //     this.specialNotes = "";
        //     this.orderItems = new ArrayList<>();
        //     this.quantity = 0;
        //     this.total = 0;
        //     this.rating = null;
        // }


    //     {/* will take basket of items <Arraylist></Arraylist>

    //      will take a total of item prices from checkout

    //    need a <option>scrolldown table menu </option> table option scroll menu, 

    //    needs a <button>submit button</button>   needs to persist to database with a postmethod similar 
    //    to how done in createPirate and in Login Page with customer*/

    //    //reference CreatePirate and use Insomnia for testing the route to basket 

    //    }