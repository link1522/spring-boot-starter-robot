package com.example.robot.controller;

import com.example.robot.services.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/robot")
public class RobotController {

  @Autowired
  RobotService robotService;

  @GetMapping("/hi")
  public String robotHi() {
    return robotService.sayHi();
  }
}
