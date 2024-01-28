import { useNavigate } from 'react-router-dom'

const Profile = () => {

    const navigate = useNavigate()
    const logout = () => {
        sessionStorage.removeItem('userId')
        sessionStorage.removeItem('firstName')
        sessionStorage.removeItem('loginStatus')
        sessionStorage.removeItem('mem')
        navigate("/home")
        window.location.reload(false);
    }
    return(
        <div>
            <div className="row">
                <div className="col-1"></div>
                <div className="col-10"><h2>Inside Profile Page</h2></div>
                <button onClick={logout}>logout</button>
                <div className="col-1"></div>
            </div>
        </div>
    );
}

export default Profile;