package com.xworkz.app.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.RobotDTO;

public class RobotRunner {

	public static void main(String[] args) {
		RobotDTO dto1 = new RobotDTO("TechBot", 1999.99, true, "Assistance");
		RobotDTO dto2 = new RobotDTO("RoboHelper", 1499.95, false, "Household Chores");
		RobotDTO dto3 = new RobotDTO("NanoDroid", 599.99, true, "Entertainment");
		RobotDTO dto4 = new RobotDTO("WorkAssist", 2499.99, false, "Office Tasks");
		RobotDTO dto5 = new RobotDTO("GuardianX", 1799.99, true, "Security");
		Collection<RobotDTO> robotDTOs = new LinkedList<RobotDTO>();
		robotDTOs.add(dto1);
		robotDTOs.add(dto2);
		robotDTOs.add(dto3);
		robotDTOs.add(dto4);
		robotDTOs.add(dto5);

		robotDTOs.stream().sorted().forEach(robot -> System.out.println(robot));
	}
}
