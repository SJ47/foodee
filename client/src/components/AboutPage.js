import AboutMap from './AboutMap';
import TopNavBar from '../components/TopNavBar';
import '../css/AboutPage.css';

const AboutPage = ({restaurants}) => {
    
    return (
        <>
        <TopNavBar />
        <div className="about-page">
            <p>
            Bringing you blablabla and some of the best blabla in the city, this Glasgow restaurant is a must visit if you're looking for something a little different. Make sure to swing by!
            </p>
            <AboutMap restaurants={restaurants} />
        </div>
        </>
    )

}

export default AboutPage;