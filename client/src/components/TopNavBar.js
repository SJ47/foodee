import React, {useEffect, useState} from 'react';
import FooDeeLogo from '../components/FooDeeLogo';
import HamburgerMenu from './HamburgerMenu';
import ShoppingBasket from './ShoppingBasket';

const TopNavBar = () => {
    return (
        <>
        <FooDeeLogo></FooDeeLogo>
        <ShoppingBasket></ShoppingBasket>
        <HamburgerMenu></HamburgerMenu>
        </>
    )

};
    
    export default TopNavBar;