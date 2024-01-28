import axios from 'axios'
import { useNavigate } from 'react-router'
import { useState, useEffect } from 'react'
import { useLocation } from 'react-router-dom'
import HotelComponent from '../../components/HotelComponent'

const Hotel_list = () => {

    const location = useLocation();
    console.log("inside hotel list")
    console.log(location.state)
    const body = {
        location: location.state.location,
        checkInDate: location.state.checkInDate,
        checkOutDate: location.state.checkOutDate,
        adultCount: location.state.adultCount,
        childCount: location.state.childCount,
        hotelType: location.state.hotelType
    }

    const url = `http://localhost:8080/hotel/searchhotels`

   /* // http method: post
    // body: contains the data to be sent to the API
    axios.post(url, body).then((response) => {
        // get the data from the response
        console.log('navigating to list')
        //
        console.log(response.data.data)

        console.log(response.status)
        if (response['status'] == 'success') {
            console.log('navigating to list')
            console.log(response.data)
            // navigate to the hotel list page
            //navigate('/hotellist',body)
        } else {
            console.log(response['error'])
        }
    })
    const [hotels, setHotels] = useState([
        {
            hotelId: 1,
            hotelName: "Atithi1",
            city: "Shegaon",
            state: "Maharashtra",
            country: "India",
            pinCode: 44403,
            hotelType: "Premium",
            amenities: "Gym Pool Laundry",
            noOfRooms: 3,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: false
        },
        {
            hotelId: 2,
            hotelName: "Atithi2",
            city: "Akola",
            state: "Maharashtra",
            country: "India",
            pinCode: 411003,
            hotelType: "Budget",
            amenities: "Gym ",
            noOfRooms: 4,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: false
        },
        {
            hotelId: 3,
            hotelName: "Atithi3",
            city: "Pune",
            state: "Maharashtra",
            country: "India",
            pinCode: 411222,
            hotelType: "Premium",
            amenities: "Gym Pool Laundry Breakfast",
            noOfRooms: 5,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: true
        },
        {
            hotelId: 4,
            hotelName: "Atithi Niwas",
            city: "Indore",
            state: "Madhya Pradesh",
            country: "India",
            pinCode: 411456,
            hotelType: "Free",
            amenities: "Breakfast",
            noOfRooms: 5,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: true
        },
        {
            hotelId: 5,
            hotelName: "atithi_123",
            city: "Pune",
            state: "Maharashtra",
            country: "India",
            pinCode: 411002,
            hotelType: "budget",
            amenities: "abc",
            noOfRooms: 3,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: true
        },
        {
            hotelId: 6,
            hotelName: "Atithi6",
            city: "Jaipur",
            state: "Rajasthan",
            country: "India",
            pinCode: 434001,
            hotelType: "Premium",
            amenities: "Gym Pool Breakfast",
            noOfRooms: 4,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: false
        },
        {
            hotelId: 7,
            hotelName: "Atithi7",
            city: "Surat",
            state: "Gujrat",
            country: "India",
            pinCode: 400124,
            hotelType: "Budget",
            amenities: "Breakfast",
            noOfRooms: 3,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: false
        },
        {
            hotelId: 8,
            hotelName: "Nivara",
            city: "Pune",
            state: "Maharashtra",
            country: "India",
            pinCode: 444203,
            hotelType: "Premium",
            amenities: "abc",
            noOfRooms: 5,
            bedImg: "img1",
            washroomImg: "img2",
            exteriorImg: "img3",
            otherImg: "img4",
            homestay: false
        }
    ])

    console.log("own list")*/
    const [hotels, setHotels] = useState([])

    // make a call to the search api to get the results
    const searchHotels = () => {
      const url = `http://localhost:8080/hotel/searchhotels`
      axios.post(url,body).then((response) => {
        const result = response.data
        if (result['status'] == 'success') {
          setHotels(result['data'])
        } else {
          console.log(result['error'])
        }
      })
    }
  
    // load the data in the beginning
    useEffect(() => {
      searchHotels()
      console.log('getting called')
    }, [])

    console.log(hotels)
    return (

        <div>
            <div className="row">
                <div className="col-1"></div>
                
                <div className="col-1"></div>
                <div className="row">
                    {hotels.map((hotel) => {
                        return <HotelComponent hotel={hotel} />
                    })}
                </div>
            </div>
        </div>
    );
}

export default Hotel_list;