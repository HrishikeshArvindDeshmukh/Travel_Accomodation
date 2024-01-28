import './App.css';

import { BrowserRouter, Route, Routes , Link } from 'react-router-dom'
import Home from './pages/Home';
import About from './pages/About_us';
import Contact from './pages/Contact_Us';
import Signin from './pages/Signin';
import Signup from './pages/Signup';
import Service from './pages/Services';
import HotelList from './pages/HotelList';
import HotelDetails from './pages/HotelDetails';

import logo from './assets/logo2.png';
import Navbar from './components/Navbar'; 

function App() {
  return (
    <div className="container">
      <BrowserRouter>
        
        <div className="row">
          <Navbar/>
        </div>
        
        <div className="row" style={{marginTop: "7.5%", width: "99.9%",marginLeft: "0.25%"}}>
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/home" element={<Home />} />
              <Route path="/service" element={<Service />} />w
              <Route path="/about" element={<About />} />
              <Route path="/contact" element={<Contact />} />
              <Route path="/signin" element={<Signin />} />
              <Route path="/signup" element={<Signup />} />
              <Route path="/hotellist" element={<HotelList/>} />
              <Route path="/hoteldetails" element={< HotelDetails/>} />
            </Routes>
        </div>
      </BrowserRouter>

      <div>
        <footer>
          
        </footer>
      </div>

    </div>
  );
}

export default App;
