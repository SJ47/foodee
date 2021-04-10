import '../css/MenuPage.css';
import MenuCategoryNavBar from '../components/MenuCategoryNavBar';
import MenuItemList from '../components/MenuItemList';
import TopNavBar from '../components/TopNavBar';
import Checkout from '../components/Checkout';

const MenuPage = ({ currentItems, handleCategoryNavClick, handleSelectedItemAdd, handleSelectedItemRemove, category, basket, basketValue }) => {

    return (
        <>
            <TopNavBar />
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
            <Checkout basket={basket} basketValue={basketValue} />
        </>
    )
}

export default MenuPage;