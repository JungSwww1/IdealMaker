import axios from "axios";

const LocalAxios = () => {
    const instance = axios.create({
        baseURL:import.meta.env.VITE_API_KEY,
        headers: {
            "Content-Type": `application/json;charset=UTF-8`,
            "Accept": "application/json",
            "Access-Control-Allow-Origin": [`http://127.0.0.1:3000`,`http://j10a302.p.ssafy.io:3000`,],
            'Access-Control-Allow-Credentials':"true",
        },
    })
    return instance
}

export default LocalAxios