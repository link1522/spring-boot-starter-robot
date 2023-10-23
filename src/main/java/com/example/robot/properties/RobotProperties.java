package com.example.robot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "robot")
public class RobotProperties {

  private String name;
  private String age;
  private String email;
}
