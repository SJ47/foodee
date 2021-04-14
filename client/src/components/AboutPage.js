
import AboutMap from './AboutMap';
import TopNavBar from '../components/TopNavBar';
import '../css/AboutPage.css';
import Image1 from "../images/Image1.png";


const AboutPage = ({restaurants}) => {
    
    return (
        <>
        <TopNavBar />
        <div className="about-page">
             <h1 className="about-headline"> About us </h1> 
             <h3>Our address</h3> 
             <p>Glasgow</p>
             <p>lockwise, 77 Renfrew St</p>
             <p>G2 3BZ</p>
             <p>Call: 0131 290 2600</p>

             <h2> The story behind Boule au Mur </h2> 
             <span></span>
             <div className="wrapper"></div>
          
            <img className="brothers-image"src={Image1} alt="two brothers having some wine" height="100" width="70"/>

            <p> In 1882 two brothers were playing the popular French game 
                called Boules when one of their balls made a dent in the wall of 
                the restaurant they were renovating. They had not decided on a name 
                for their new establishment, but decided there and then that the name would be 
                Boule au Mur, which means “balls to the wall”. This would combine their love of the
                 ball game with their passion for food.  They opened the restaurant in a small French 
                 village and it was a roaring success. The brothers franchised their business and the love
                 of good food they brought to their menus is still found in Boule au Mur restaurants around
                the globe. </p>
                <span></span>

                <h4>Find other Boule au Mur restuarants</h4>
            <AboutMap restaurants={restaurants} />
        </div>
        </>
    )

}

export default AboutPage;