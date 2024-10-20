import React from "react";
import {useState, useEffect} from "react";
import { TextField } from "@mui/material";
import './login.css';

export function Login() {
const [username, setUserName] = useState("");

const handleChange = (event) => {
    setUserName(event.target.value);
}

    return (
    <div className="field">
        <div className="card">
        <TextField id="outlined-basic" label="Usuario" variant="outlined" value={username} />
        </div>
    </div>
  );
}
