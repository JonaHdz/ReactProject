import { useState, useEffect } from "react";
import { Heading, Image } from "@chakra-ui/react";
import * as API from "../sevices/launches";
import { LaunchItem } from "../components/LaunchItem";

export function LaunchList() {
  const [launches, setLaunches] = useState([]);

  useEffect(() => {
    API.getAllLaunches().then(setLaunches);
    console.log("Launches loaded", JSON.stringify(launches));
  }, []); //el [] esta vacio, asi se ejecuta al iniciar la pagina

  return (
    <>
      <Heading as="h1" fontSize={"4xl"} m={4}>
        SpaceX Launches
      </Heading>
      {!launches.length === 0 ? (
        <div>Loading...</div>
      ) : (
        <section>
          {launches.map((launchItem) => (
            <LaunchItem
              key={launchItem.flight_number}
              launch={launchItem}></LaunchItem>
          ))}
        </section>
      )}
    </>
  );
}
