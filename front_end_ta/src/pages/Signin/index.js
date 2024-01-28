import { useState } from 'react'
import './index.css'
import { Link } from 'react-router-dom'
import axios from 'axios'
import { toast } from 'react-toastify'
import { useNavigate } from 'react-router'


const Signin = () => {
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')

  const navigate = useNavigate()

  const signinUser = () => {
    if (email.length == 0) {
      toast.warning('please enter email')
    } else if (password.length == 0) {
      toast.warning('please enter password')
    } else {
      const body = {
        email,
        password,
      }

          const url = `http://localhost:8080/user/signin`
          axios.post(url, body).then((response) => {
          
            const result = response.data
            console.log(result)
            if (result['status'] == 'success') {
              toast.success('Welcome')
              
              const { userId, firstName,role} = result['data']
              let mem = 0
              console.log(role)
              if(role=='customer'){
                mem = false
              }else if(role=='admin'){
                mem = true
              }

              //Session storage
              sessionStorage['userId'] = userId
              sessionStorage['firstName'] = firstName
              sessionStorage['loginStatus'] = true
              sessionStorage['mem'] = mem
              //

              navigate('/home')
            } else {
              toast.error('Invalid user name or password')
            }
          })
        }
      }
  return (
 
  <div>
      <div className="row">
        <h2 align="center">Signin</h2>
        <div className="col"></div>
        <div className="col">
          <div className="form">
            <div className="mb-3">
              <label htmlFor="" className="label-control">
                Email address
              </label>
              <input
                onChange={(e) => {
                  setEmail(e.target.value)}}
                type="text"
                className="form-control"/>
            </div>
            <div className="mb-3">
              <label htmlFor="" className="label-control">Password</label>
              <input
                onChange={(e) => {
                  setPassword(e.target.value)
                }}
                type="password"
                className="form-control"
              />
            </div>
            <div>
            No account yet? <Link to="/signup">Signup here</Link>
            </div>
            <div className="mb-3">
              <button onClick={signinUser} className="btn btn-primary">
                Signin
              </button>
            </div>
          </div>
        </div>
        <div className="col"></div>
      </div>
    </div>
  ) 
}
export default Signin
