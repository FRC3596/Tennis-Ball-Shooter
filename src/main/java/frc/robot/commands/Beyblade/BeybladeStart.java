package frc.robot.commands.Beyblade;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMappings;

public class BeybladeStart extends CommandBase {

    public BeybladeStart()
    {
        addRequirements(RobotMappings.beyblade);
    }

    @Override
    public void initialize()
    {
        // Set the beyblade status to 1 or true
        RobotMappings.BeybladeSpinning = true;
    }

    @Override
    public boolean isFinished()
    {
        return true;
    }
    
}
