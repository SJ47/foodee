import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import '../css/AboutPage.css';
// import {Icon} from 'leaflet';

// const ballIcon = new Icon ({
//     iconUrl: '../media/fork.png',
//     iconSize: [50, 50]
// });

const AboutMap = ({restaurants}) => {
    
    const restaurantMarkers = restaurants.map((restaurant, index) => {
        // let logo = FooDeeLogo;
        return (
            <Marker
                // icon={ballIcon}
                key={index}
                position={[restaurant.latitude, restaurant.longitude]}
                // icon={new Icon({
                //     iconUrl: logo,
                //     iconSize: [50, 50],
                //     className: "icon-marker"
                // })}
                >
                <Popup>
                    {/* <b>{restaurant.name}</b> */}
                    <b id="address-popup">Glasgow<br></br><br></br>Clockwise,<br></br>77 Renfrew St,<br></br>G2 3BZ<br></br><br></br>Call: 0131 290 2600</b>
                </Popup>
            </Marker>
        )
    })

    return (
        <div className="map-container">
            <MapContainer center={[55.864239, -4.251806]} zoom={12} scrollWheelZoom={true}>
            <TileLayer
                attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
            />
            {restaurantMarkers}
            </MapContainer>
        </div>
    )
    }

export default AboutMap;