import hotelImage from '../assets/samHotel.jpg';
import './HotelComponent.css'

const HotelComponent = (props) => {

    const Name = props.hotel.hotelName;
    const Address = props.hotel.city + ", " + props.hotel.state + ", " + props.hotel.country;
    const rating = "5"
    const Price= 1000

    return (
        <div className="hoteldiv col-md-3">
            <img src={hotelImage} id="hotelImage"/>
            <div id="title"><h2>{Name}</h2></div>
            <div id="address">{Address}</div>
            <div id="rating">{rating}</div>
            <div id="price"><h1><i class="fa fa-inr"></i>{Price}</h1>/Night</div>
        </div>









)}

export default HotelComponent