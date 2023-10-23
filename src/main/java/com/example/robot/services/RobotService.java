package com.example.robot.services;

import com.example.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

  @Autowired
  RobotProperties robotProperties;

  public String sayHi() {
    return "hi, " + robotProperties.getName();
  }
}
