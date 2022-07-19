package frc.robot.commands.Beyblade;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMappings;

public class BeybladeEnd extends CommandBase {

    public BeybladeEnd()
    {
        addRequirements(RobotMappings.beyblade);
    }

    @Override
    public void initialize()
    {
        // Sets the beyblade status to 0 or false
        RobotMappings.BeybladeSpinning = false;
    }

    @Override
    public boolean isFinished()
    {
        return true;
    }
    
}
