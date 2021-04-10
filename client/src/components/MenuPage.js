import '../css/MenuPage.css';
import MenuCategoryNavBar from '../components/MenuCategoryNavBar';
import MenuItemList from '../components/MenuItemList';
import TopNavBar from '../components/TopNavBar';

const MenuPage = ({currentItems, handleCategoryNavClick}) => {
    
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
    
    export default MenuPage;