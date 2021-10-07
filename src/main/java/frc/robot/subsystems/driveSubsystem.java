// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveSubsystem extends SubsystemBase {
  /** Creates a new driveSubsystem. */
  Victor LF = new Victor(1); 
  Victor LB = new Victor(3);
  Victor RF = new Victor(5);
  Victor RB = new Victor(7);   

  SpeedControllerGroup leftMotors = new SpeedControllerGroup(LF, LB);
  SpeedControllerGroup rightMotors = new SpeedControllerGroup(RF, RB);

  DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  public void tankDrive(double leftSpeed, double rightSpeed){
    drive.tankDrive(leftSpeed, rightSpeed);
  }


  public driveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
