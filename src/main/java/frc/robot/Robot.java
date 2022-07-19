package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {

  @Override
  public void robotInit() {}

  @Override
  public void teleopPeriodic()
  {
    // Drive motors
    RobotMappings.driveTrainSub.UpdateDrive();
    RobotMappings.driveTrainSub.Drive();

    // This code runs in a infinate loop untill teleopPeriod is over
    // Run the command scheduler to start executing scheduled commands
    CommandScheduler.getInstance().run();
  }
}
