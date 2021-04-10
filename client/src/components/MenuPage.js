import '../css/MenuPage.css';
import MenuCategoryNavBar from '../components/MenuCategoryNavBar';
import MenuCategorySubNavBar from '../components/MenuCategorySubNavBar';
import MenuItemList from '../components/MenuItemList';
import TopNavBar from '../components/TopNavBar';
import Checkout from '../components/Checkout';

// const MenuPage = ({ currentItems, handleCategoryNavClick, handleSelectedItemAdd, handleSelectedItemRemove, category, basket, basketValue }) => {

//     return (
//         <>
//             <TopNavBar />
//             <div className="menu-page">
//                 <MenuCategoryNavBar onCategoryNavClick={handleCategoryNavClick} />
//                 <MenuItemList
//                     currentItems={currentItems}
//                     handleCategoryNavClick={handleCategoryNavClick}
//                     category={category}
//                     handleSelectedItemAdd={handleSelectedItemAdd}
//                     handleSelectedItemRemove={handleSelectedItemRemove}
//                     basket={basket}
//                     basketValue={basketValue}
//                 />
//             </div>
//             <Checkout basket={basket} basketValue={basketValue} />
//         </>
//     )
// }

const MenuPage = ({ currentItems, handleCategoryNavClick, category, handleSelectedItemAdd, handleSelectedItemRemove, basket, basketValue }) => {

    if (category === "menu_items/category/hard_drink" || category === "menu_items/category/soft_drink" || category === "menu_items/category/hot_drink") {
        return (
            <>
                <TopNavBar />
                <div className="menu-page">
                    <MenuCategoryNavBar onCategoryNavClick={handleCategoryNavClick} />
                    <MenuCategorySubNavBar onCategoryNavClick={handleCategoryNavClick} />
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
    } else {
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

}

export default MenuPage;