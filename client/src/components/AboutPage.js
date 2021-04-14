
import AboutMap from './AboutMap';
import TopNavBar from '../components/TopNavBar';
import '../css/AboutPage.css';
import brothers from "../media/brothers.png";


const AboutPage = ({restaurants}) => {
    
    return (
        <>
        <TopNavBar />
        <div className="about-page">
             <h1 className="about-headline"> About us </h1> 
             {/* <h3>Our address</h3> 
             <p>Glasgow</p>
             <p>lockwise, 77 Renfrew St</p>
             <p>G2 3BZ</p>
             <p>Call: 0131 290 2600</p> */}

             <h2> The story behind Boules au Mur </h2> 
             {/* <span></span>
             <div className="wrapper"></div> */}
          
            <img className="brothers-image"src={brothers} alt="two brothers having some wine"/>

            <p> In 1882 two brothers were playing the popular French game 
                called Boules when one of their balls made a dent in the wall of 
                the restaurant they were renovating.<br></br><br></br>They had not decided on a name 
                for their new establishment, but decided there and then that the name would be <i>Boules au Mur</i>, which means “balls to the wall”.<br></br><br></br>This would combine their love of the
                 ball game with their passion for food.<br></br><br></br>They opened the restaurant in a small French 
                 village, Asnières-sur-Nouère, and it was a roaring success. The brothers franchised their business and the love
                 of good food they brought to their menus is still found in Boules au Mur restaurants around
                the globe. </p>
                {/* <span></span> */}
   

                <h4>Find a Boules au Mur near you</h4>
            <AboutMap restaurants={restaurants} />
        </div>
        </>
    )

}

export default AboutPage;