
import logo from "./assets/logo-spaceX.png";
import {  Image, } from "@chakra-ui/react";

import {Routes, Route} from "react-router-dom";
import { LaunchList } from "./components/LaunchList";


import {LaunchDetail} from "./components/LaunchDetail";

function App() {

  return (
    <>
      <Image m={4} src={logo} alt="logo de spaceX" width={300} />
      <Routes>
        <Route path="/" element={<LaunchList></LaunchList>}></Route>
        <Route path="launch/:id" element={<LaunchDetail></LaunchDetail>}></Route>
      </Routes>
      
    </>
  );
}

export default App;
