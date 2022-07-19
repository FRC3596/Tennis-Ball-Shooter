package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import frc.robot.OI;
import frc.robot.RobotMappings;

public class DriveTrainSub extends SubsystemBase {
    // Define motors used for driving
    public static final PWMVictorSPX LeftMotor = new PWMVictorSPX(0);
    public static final PWMVictorSPX RightMotor = new PWMVictorSPX(1);
    
    // Define speed varaibles for both motors
    private static double MovL = 0;
    private static double MovR = 0;

    // Define drivetrain
    public static final DifferentialDrive driveTrain
    = new DifferentialDrive(LeftMotor, RightMotor);

    // Init class
    public DriveTrainSub() {}


    // Drive function. When this is called it will update the motor speeds
    public void Drive()
    {
        DriveTrainSub.driveTrain.tankDrive(MovL, MovR);
    }

    // Update drivetrain speed values depending what is going on
    public void UpdateDrive()
    {
        if (RobotMappings.BeybladeSpinning) // If beyblade mode is on do not allow the drivetrain to pull any other values
        {
            MovL = 1;
            MovR = -1;
            return;
        }

        if (!RobotMappings.LockControls) // Check if lock is not engaged
        {
            // Lock disengaged get the latest values from OI
            MovL = OI.RIGHT_Y_AXIS();
            MovR = OI.LEFT_Y_AXIS();
        }
        else
        {
            // Lock engaged replay saved joystick values
            MovL = RobotMappings.RightLockedY;
            MovR = RobotMappings.LeftLockedY;
        }
    }

    // Toggle motor position lock
    public void ToggleMotorLock()
    {
        if (RobotMappings.BeybladeSpinning) { return; } // Don't toggle if beyblade is enabled

        if (!RobotMappings.LockControls) // Check if control are locked
        {
            RobotMappings.LeftLockedY = OI.LEFT_Y_AXIS();
            RobotMappings.RightLockedY = OI.RIGHT_Y_AXIS();

            RobotMappings.LockControls = true;
        }
        else // Control is locked
        {
            RobotMappings.LockControls = false;
        }
    }
    
    // Edit motor lock position
    public void ModifyMotorLock(String axis, double amount)
    {
        switch (axis.toLowerCase()) // Switch axis
        {
            case "y": // Increase Y
                RobotMappings.LeftLockedY += amount;
                break;

            case "x": // Increase X
                RobotMappings.RightLockedY += amount;
                break;
        }
    }
}
