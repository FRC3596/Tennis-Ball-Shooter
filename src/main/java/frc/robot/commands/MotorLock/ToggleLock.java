package frc.robot.commands.MotorLock;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotMappings;

public class ToggleLock extends CommandBase {

    public ToggleLock()
    {
        addRequirements(RobotMappings.driveTrainSub);
    }
    
    @Override
    public void initialize()
    {
        RobotMappings.driveTrainSub.ToggleMotorLock();
    }
    
    @Override
    public boolean isFinished()
    {
        return true;
    }
}
