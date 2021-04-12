import React, { useState } from 'react';
import '../css/OrderForm.css';
import '../css/LoginPage.css'
import { Link } from "react-router-dom"


const OrderForm = ({ customer, basket, basketValue, handleOrderPost }) => {

    // const totalValue = basket.map((item) => {
    //     let total = 0;
    //     return total += item.price
    // })

    const [stateOrder, setStateOrder] = useState(
        {
            customer: customer,
            specialNotes: "",
            total: basketValue,
            quantity: basket.length,
            orderItems: basket
        }
    )

    const handleChange = function (event) {
        let propertyName = event.target.textarea;
        let copiedOrder = { ...stateOrder }
        copiedOrder[propertyName] = event.target.value;
        copiedOrder[customer] = customer;
        setStateOrder(copiedOrder)
    }

    const handleSubmit = function (event) {
        console.log("handleSubmit called")
        event.preventDefault();
        handleOrderPost(stateOrder);
    }

    return (
<<<<<<< HEAD
        <>
             <form onSubmit={handleSubmit}>
                <input type="text" placeholder="special notes" name="specialNotes" onChange={handleChange} value={stateOrder.specialNotes} />
                {/* <select name="table" onChange={handleTable} defaultValue="select-table">
        <option disabled value='select-ship'>Select a Table</option>
            {tableOptions}
        </select>  */}
           
            </form>
            <Link to="/paymentform" className="checkout-text" basket={basket}>
            <button className="order-btn" type="submit">Pay Now</button>
            </Link>
        </>

        //         <i className="fas fa-shopping-cart"></i>
        // <div className="basket-item-count">{qtyInBasket}</div>
        // <button onClick={handlePayment}>
        //     <Link to="/paymentform" className="checkout-text">
        //     CHECKOUT
        //     </Link>
        // </button>
        // <div className="checkout-total">£{basketValue}</div>



=======
        <div className="order-form">
            <form onSubmit={handleSubmit}>
                <textarea className="large-text" placeholder="Special notes..." name="specialNotes" onChange={handleChange} value={stateOrder.specialNotes} />
                {/* <input className="large-text" type="textarea" placeholder="Special notes..." name="specialNotes" onChange={handleChange} value={stateOrder.specialNotes} /> */}
                <br></br>
                <Link to="/paymentform">
                    <button className="order-btn" type="submit">SUBMIT</button>
                </Link>
            </form>
>>>>>>> develop

        </div>
    )
}


export default OrderForm;

    //     {/* will take basket of items <Arraylist></Arraylist>

    //      will take a total of item prices from checkout

    //    need a <option>scrolldown table menu </option> table option scroll menu, 

    //    needs a <button>submit button</button>   needs to persist to database with a postmethod similar 
    //    to how done in createPirate and in Login Page with customer*/

    //    //reference CreatePirate and use Insomnia for testing the route to basket 

    //    }