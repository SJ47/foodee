import '../css/MenuPage.css';
import MenuCategoryNavBar from '../components/MenuCategoryNavBar';
import MenuCategorySubNavBar from '../components/MenuCategorySubNavBar';
import MenuItemList from '../components/MenuItemList';
import TopNavBar from '../components/TopNavBar';

const MenuPage = ({currentItems, handleCategoryNavClick, category}) => {
    
    if(category === "menu_items/category/hard_drink" || category === "menu_items/category/soft_drink" || category === "menu_items/category/hot_drink" ) {
        return (
            <>
            <TopNavBar />
            <div className="menu-page">
                <MenuCategoryNavBar onCategoryNavClick={handleCategoryNavClick}  />
                <MenuCategorySubNavBar onCategoryNavClick={handleCategoryNavClick}  />
                <MenuItemList currentItems={currentItems} />
            </div>
            </>
        )
    } else {
        return (
            <>
            <TopNavBar />
            <div className="menu-page">
                <MenuCategoryNavBar onCategoryNavClick={handleCategoryNavClick} />
                <MenuItemList currentItems={currentItems} />
            </div>
            </>
        )
    }

}
    
export default MenuPage;