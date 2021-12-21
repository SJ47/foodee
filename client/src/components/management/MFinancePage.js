import MNavBar from './MNavBar';
import './admin.css'

const MFinancePage = () => {

    // hardcoded it all just for fun, not because our db doesn't work ahem (◔_◔) 

    let revenue = 12438.50;
    let costs = 8200.40;
    let netProfit = revenue - costs;
    let netProfitMargin = ((netProfit / revenue) * 100).toFixed(2);

    return (
        <>
            <MNavBar />
            <div className="admin-finances admin-page">
                <h1>Finances overview</h1>

                <table className="order-table">
                    <thead>
                        <tr>
                            <th>SHAREHOLDER SCORES</th>
                            <th>Q1</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Sales</td>
                            <td>{revenue}</td>
                        </tr>
                        <tr>
                            <td>Costs</td>
                            <td>{costs}</td>
                        </tr>
                        <tr>
                            <td>Net Profit</td>
                            <td>{netProfit}</td>
                        </tr>
                        <tr>
                            <td>Net Profit Margin</td>
                            <td>%{netProfitMargin}</td>
                        </tr>
                    </tbody>
                </table>
                <table className="order-table">
                    <thead>
                        <tr>
                            <th>SALES</th>
                            <th>Actual</th>
                            <th>Budget</th>
                            <th>Var vs Budget</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Food</td>
                            <td>actual food money</td>
                            <td>budget food money</td>
                            <td>var</td>
                        </tr>
                        <tr>
                            <td>Drinks</td>
                            <td>actual drinks money</td>
                            <td>budget drinks money</td>
                            <td>var</td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td>TOTAL</td>
                            <td>total money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                    </tfoot>
                </table>
                <table className="order-table">
                    <thead>
                        <tr>
                            <th>COSTS</th>
                            <th>Actual</th>
                            <th>Budget</th>
                            <th>Var vs Budget</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Managers Salaries</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                        <tr>
                            <td>Kitchen Labour</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                        <tr>
                            <td>Bar/Restaurant Labour</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                        <tr>
                            <td>Food cost</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                        <tr>
                            <td>Beverage cost</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                        <tr>
                            <td>Repairs</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                        <tr>
                            <td>Cleaning materials</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td>TOTAL</td>
                            <td>actual money</td>
                            <td>budget money</td>
                            <td>var</td>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </>
    )
}

export default MFinancePage;