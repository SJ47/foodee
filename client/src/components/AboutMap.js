import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import '../css/AboutPage.css';
// import {Icon} from 'leaflet';
// import FooDeeLogo from '../media/fooDeeLogoBlueTransparent.png';

const AboutMap = ({restaurants}) => {
    
    const restaurantMarkers = restaurants.map((restaurant, index) => {
        // let logo = FooDeeLogo;
        return (
            <Marker 
                key={index}
                position={[restaurant.latitude, restaurant.longitude]}
                // icon={new Icon({
                //     iconUrl: logo,
                //     iconSize: [50, 50],
                //     className: "icon-marker"
                // })}
                >
                <Popup>
                    <b>{restaurant.name}</b>
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

    // if(restaurants.length === 0) {
    //     return (
    //         <div className="map-container">
    //             <MapContainer center={[55.864239, -4.251806]} zoom={12} scrollWheelZoom={false}>
    //             <TileLayer
    //                 attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
    //                 url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
    //             />
    //             </MapContainer>
    //         </div>
    //     )
    // } else {
    //     return (
    //         <div className="map-container">
    //             <MapContainer center={[55.864239, -4.251806]} zoom={12} scrollWheelZoom={false}>
    //             <TileLayer
    //                 attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
    //                 url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
    //             />
    //             {restaurantMarkers}
    //             </MapContainer>
    //         </div>
    //     )}
}

export default AboutMap;