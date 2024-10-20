import { Box, Text, Spacer, Flex, Tag, Button } from "@chakra-ui/react";
import { IoIosCalendar } from "react-icons/io";
import { Link } from "react-router-dom";

export function LaunchItem( {launch} ) {
  
  return (
    <Box
      bg="gray.100"
      p={4}
      m={4}
      borderRadius={"lg"}
      key={launch.flight_number}>
      <Flex>
        <Text fontSize={"2xl"}>
          Mission<strong>{launch.mission_name}</strong> ({launch.launch_year})
        </Text>
        <Spacer></Spacer>
        <Tag p={2} colorScheme={launch.launch_success ? "green" : "red"}>
          {launch.launch_success ? "success" : "failure"}
        </Tag>
      </Flex>

      <Flex align={"center"}>
        <IoIosCalendar></IoIosCalendar>
        <Text fontSize={"sm"} ml={1}>
          {launch.launch_date_local.split("T")[0]}
        </Text>
      </Flex>
      <Link to={`/launch/${launch.flight_number}`}>
        <Button mt={2} colorScheme="purple">
          Ver detalles
        </Button>
      </Link>
    </Box>
  );
}
