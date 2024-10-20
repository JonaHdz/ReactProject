import { useParams } from "react-router-dom";
import { useState, useEffect } from "react";
import * as API from "../sevices/launches";

import { Box, Flex, Heading, Spacer, Tag, Text } from "@chakra-ui/react";
import { div } from "framer-motion/client";

export function LaunchDetail(props) {
  const { id } = useParams();

  const [launch, setLaunch] = useState({});

  useEffect(() => {
    API.getlaunchByFlightNumber(id)
      .then((data) => {
        console.log(data);
        setLaunch(data);
      })
      .catch((error) => {
        console.error(error);
      });
  }, [id]);

  return (
    <>
      {!launch ? (
        <div>Loading...</div>
      ) : (
        <Box
          bg="gray.100"
          p={4}
          m={4}
          borderRadius={"lg"}
          key={launch.flight_number}>
          <Flex>
            <Text fontSize={"2xl"}>
              Mission<strong>{launch.mission_name}</strong> (
              {launch.launch_year})
            </Text>
            <Spacer></Spacer>
            <Tag p={2} colorScheme={launch.launch_success ? "green" : "red"}>
              {launch.launch_success ? "success" : "failure"}
            </Tag>
          </Flex>
        </Box>
      )}
    </>
  );
}
