package frc.robot.commands.MotorLock;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.RobotMappings;

public class IncreaseLocked extends CommandBase {
    
    public IncreaseLocked()
    {
        addRequirements(RobotMappings.driveTrainSub);
    }

    @Override
    public void initialize()
    {
        // Check if both the X button is preased and if increasing the value will not go over 1
        if (OI.X.get() && (RobotMappings.LeftLockedY+0.1 < 1)) {
            RobotMappings.driveTrainSub.ModifyMotorLock("Y", 0.1);
        }

        // Check if both the B button is pressed and if increasing the value is greator than 1
        if (OI.B.get() && (RobotMappings.RightLockedY+0.1 < 1)) {
            RobotMappings.driveTrainSub.ModifyMotorLock("X", 0.1);
        }
    }

    @Override
    public boolean isFinished()
    {
        return true;
    }

}
