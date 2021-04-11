import { slide as SideMenu } from 'react-burger-menu'
import '../css/SideNavBar.css'

const SideNavBar = () => {

    // NOTE: You also need to provide styles, see https://github.com/negomi/react-burger-menu#styling
    return (
      <SideMenu>
        <a id="home" className="menu-item" href="/">Home</a>
        <a id="about" className="menu-item" href="/about">About</a>
        <a id="contact" className="menu-item" href="/contact">Contact</a>
        {/* <a onClick={ this.showSettings } className="menu-item--small" href="">Settings</a> */}
      </SideMenu>
    );
}

export default SideNavBar;