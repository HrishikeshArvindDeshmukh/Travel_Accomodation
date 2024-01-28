import welcomeImage from '../../assets/Travel7.jpg';
import './index.css'
import 'react-toastify/dist/ReactToastify.min.css';
import { Link } from 'react-router-dom'
import { useState } from 'react'
import { ToastContainer, toast } from 'react-toastify'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'



const Home = () => {

    const [location, setLocation] = useState('')
    const [checkInDate, setCheckInDate] = useState('')
    const [checkOutDate, setCheckOutDat] = useState('')
    const [adultCount, setAdultCount] = useState('')
    const [childCount, setChildCount] = useState('')
    const [hotelType, setHotelType] = useState('')


    // used to navigate from one component to another
    const navigate = useNavigate()

    const submitSearch = () => {
        console.log("inside submit search method")
        if (location.length == 0) {
            toast.warning('Please enter location')
        } else if (checkInDate.length == 0) {
            toast.warning('Please select Checkin Date')
        } else if (checkOutDate.length == 0) {
            toast.warning('Please Select checkOutDate')
        } else if (adultCount.length == 0) {
            toast.warning('Please enter No. of Adults')
        } else if (childCount.length == 0) {
            toast.warning('Please enter no. of Child')
        } else if (hotelType != 0 && hotelType != 1) {
            toast.warning('Please Select HotelType')
        } else {

            console.log(location);
            console.log(hotelType);
            // url to call the api
            navigate('/hotellist',{state: {
                    location,
                    checkInDate,
                    checkOutDate,
                    adultCount,
                    childCount,
                    hotelType
                }})    
        }
    }


    return (
        <div>
            <div className='row'>
                <div className=" text-center wel-image">
                    <div className="weltextMain">Welcome to Accomoda</div>
                    <div className="weltextSub">Indias Best Hotel Booking Website</div>
                </div>
            </div>

            <div className="row form_block">
                <div className="col-md-3">

                </div>
                <div className="col-md-6">
                    <form>
                        <div className="form-row">
                            <div className="form-group col">
                                <label for="HotelLocation">Location</label>
                                <input onChange={(e) => {
                                    setLocation(e.target.value)
                                }} type="text" id="HotelLocation" className="form-control " placeholder="ex. Pune" />
                            </div>
                        </div>

                        <div className="form-row">
                            <div className="form-group col-md-6">
                                <label for="CheckInDate">Check-in</label>
                                <input onChange={(e) => {
                                    setCheckInDate(e.target.value)
                                }} type="date" id="CheckInDate" className="form-control form-horizontal" />
                            </div>

                            <div className=" form-group col-md-6">
                                <label for="CheckOutDate">Check-out</label>
                                <input onChange={(e) => {
                                    setCheckOutDat(e.target.value)
                                }} type="date" id="CheckOutDate" className="form-control form-horizontal" />
                            </div>
                        </div>

                        <div className="form-row">
                            <div className="form-group col-md-6">
                                <label for="AdultCount">Adults</label>
                                <input onChange={(e) => {
                                    setAdultCount(e.target.value)
                                }} type="number" id="AdultCount" className="form-control" min="0" />
                            </div>
                            <div className="form-group col-md-6">
                                <label for="ChildCount">Childs</label>
                                <input onChange={(e) => {
                                    setChildCount(e.target.value)
                                }} type="number" id="ChildCount" className="form-control" min="0" />
                            </div>
                        </div>

                        <div className="row">
                            <b>Select Accomodation Type:</b>
                            <div className="form-group col-md-6">
                                <input onClick={(e) => {
                                    setHotelType(false)
                                }} type="radio" name="htype" id="htype1" className="form-check-input" />
                                <label className="form-check-label" for="htype1">Hotel</label>
                            </div>
                            <div className="form-group col-md-6">
                                <input onClick={(e) => {
                                    setHotelType(true)
                                }} type="radio" name="htype" id="htype2" className="form-check-input" value="1" />
                                <label for="htype2" className="form-check-label">HomeStay</label>
                            </div>
                        </div>
                        
                        <br />
                        <div className="form-row">
                            <div className="form-group col">
                                <input type="button" onClick={submitSearch} className="btn btn-primary" value="Submit" />
                            </div>
                        </div>
                    </form>
                </div>
                <div className="col-md-3">

                </div>
            </div>
            <ToastContainer />

        </div>
    );
}

export default Home;