package frc.robot.commands.Shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotMappings;

public class Shoot extends CommandBase {

    public Shoot()
    {
        addRequirements(RobotMappings.shooterSub);
    }
    
    @Override
    public void initialize()
    {
        RobotMappings.shooterSub.Fire();
    }
    
    @Override
    public boolean isFinished()
    {
        return true;
    }
}
