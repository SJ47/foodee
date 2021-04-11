import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import '../css/AboutPage.css'
// import {Icon} from 'leaflet';

const AboutMap = ({restaurants}) => {
    
    const restaurantMarkers = restaurants.map((restaurant, index) => {
        return (
            <Marker key={index} position={[restaurant.latitude, restaurant.longitude]}>
                <Popup></Popup>
            </Marker>
        )
    })

    return (
        <div className="map-container">
            <MapContainer center={[55.864239, -4.251806]} zoom={12} scrollWheelZoom={false}>
            <TileLayer
                attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
            />
            {restaurantMarkers}

            

            {/* <Marker position={[51.505, -0.09]}>
                <Popup>
                A pretty CSS3 popup. <br /> Easily customizable.
                </Popup>
            </Marker> */}
            </MapContainer>
        </div>


        // <MapContainer 
        //     center={[55.864239, -4.251806]} 
        //     zoom={10}>
        //     <TileLayer url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        //         attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'/>
        // </MapContainer>
    )
    

    // const markerNodes = restaurants.map((restaurant, index) => {

    // })
}

export default AboutMap;