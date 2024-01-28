import React from "react";
import logo from '../assets/logo2.png';
import './Navbar.css';
import { Link } from 'react-router-dom';
import { BiHome } from 'react-icons/bi';
import { RiServiceFill } from 'react-icons/ri';
import { ImHome3, ImCross } from 'react-icons/im'
import { BsPeopleFill } from 'react-icons/bs'
import { MdContactMail } from 'react-icons/md'



const Navbar = () => {
    const isLoggedIn = 0;
    let button;
    if (isLoggedIn) {
      button = <b>Aman</b>;
    } else {
      button = <Link aria-current="page" to="/signin"><button type="button" class="btn btn-outline-primary">Login</button></Link>;
    }
    
    return (
        <div>
            <nav class="navbar fixed-top navbar-light shadow p-3 mb-5 bg-white rounded">
                <div class="container-fluid">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <a class="navbar-brand logo" href="#"><img src={logo} alt="" width="220" height="60"/></a>

                    <div className="gap-3">
                        {button}
                    </div>
                    
                    <div class="collapse navbar-collapse shadow p-3 mb-5 bg-white rounded" id="navbarNav">
                        <ul class="navbar-nav"  style={{}}>

                                <li class="nav-item text-center nav-link">
                                    <span data-bs-toggle="collapse" data-bs-target="#navbarNav"><ImCross /></span>
                                </li>
                                <br />
                                <br />
                                <li class="nav-item">
                                    <Link className="nav-link" aria-current="page" to="/home"><span data-bs-toggle="collapse" data-bs-target="#navbarNav"><span style={{ paddingBottom: "5px"}}><ImHome3 /></span> Home</span></Link>
                                </li>
                            
                                <li class="nav-item">
                                    <Link className="nav-link"  aria-current="page"  to="/service"><span data-bs-toggle="collapse" data-bs-target="#navbarNav"><RiServiceFill/> Services</span></Link>
                                </li>

                                <li class="nav-item">
                                    <Link to="/about" aria-current="page" className="nav-link"><span data-bs-toggle="collapse" data-bs-target="#navbarNav"><BsPeopleFill /> About Us</span></Link>
                                </li>

                                <li class="nav-item">
                                    <Link to="/contact" aria-current="page" className="nav-link"><span data-bs-toggle="collapse" data-bs-target="#navbarNav"><MdContactMail /> Contact us</span></Link>
                                </li>                                
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    );

};

export default Navbar;