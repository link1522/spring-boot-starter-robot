package com.example.robot;

import com.example.robot.controller.RobotController;
import com.example.robot.properties.RobotProperties;
import com.example.robot.services.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ RobotController.class, RobotService.class, RobotProperties.class })
@Configuration
public class RobotAutoConfiguration {}
