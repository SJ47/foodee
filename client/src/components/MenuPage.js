import '../css/MenuPage.css';
import MenuCategoryNavBar from '../components/MenuCategoryNavBar';
import MenuItemList from '../components/MenuItemList';
import TopNavBar from '../components/TopNavBar';

const MenuPage = ({ currentItems, handleCategoryNavClick, handleSelectedItemAdd, handleSelectedItemRemove, category }) => {

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
                />
            </div>
        </>
    )
}

export default MenuPage;