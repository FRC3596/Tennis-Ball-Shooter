package frc.robot.commands.MotorLock;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.RobotMappings;

public class DecreaseLocked extends CommandBase {
    
    public DecreaseLocked()
    {
        addRequirements(RobotMappings.driveTrainSub);
    }

    @Override
    public void initialize()
    {
        // Check if both the X button is pressed and the value does not go lower than -1
        if (OI.X.get() && (RobotMappings.LeftLockedY-0.1 > -1)) {
            RobotMappings.driveTrainSub.ModifyMotorLock("Y", -0.1);
        }

        // Check if both the B button is pressed and the value does not go lower than -1
        if (OI.B.get() && (RobotMappings.RightLockedY-0.1 > -1)) {
            RobotMappings.driveTrainSub.ModifyMotorLock("X", -0.1);
        }
    }

    @Override
    public boolean isFinished()
    {
        return true;
    }

}
