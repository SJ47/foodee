import '../css/MenuPage.css';
import MenuCategoryNavBar from '../components/MenuCategoryNavBar';
import MenuItemList from '../components/MenuItemList';
import TopNavBar from '../components/TopNavBar';
import Checkout from '../components/Checkout';

const MenuPage = ({ basketCounter, currentItems, handleCategoryNavClick, category, handleSelectedItemAdd, handleSelectedItemRemove, basket, basketValue, handlePayment }) => {

    return (
        <>
            <div>
                <TopNavBar basketCounter={basketCounter} />
                <div className="menu-page">
                    <MenuCategoryNavBar onCategoryNavClick={handleCategoryNavClick} />
                    <MenuItemList
                        currentItems={currentItems}
                        handleCategoryNavClick={handleCategoryNavClick}
                        category={category}
                        handleSelectedItemAdd={handleSelectedItemAdd}
                        handleSelectedItemRemove={handleSelectedItemRemove}
                        basket={basket}
                        basketValue={basketValue}
                    />
                </div>
                <Checkout basketCounter={basketCounter} basket={basket} basketValue={basketValue} />
            </div>
        </>
    )
}

export default MenuPage;