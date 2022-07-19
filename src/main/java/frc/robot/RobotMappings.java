package frc.robot;

import frc.robot.commands.MotorLock.*;
import frc.robot.commands.Beyblade.*;
import frc.robot.commands.Shooter.*;
import frc.robot.subsystems.*;

public class RobotMappings {
    public static DriveTrainSub driveTrainSub = new DriveTrainSub();
    public static ShooterSub shooterSub = new ShooterSub();
    public static BeybladeSub beyblade = new BeybladeSub();

    public static DecreaseLocked decreaseLocked = new DecreaseLocked();
    public static IncreaseLocked increaseLocked = new IncreaseLocked();
    public static ToggleLock toggleLock = new ToggleLock();

    public static Shoot startShoot = new Shoot();

    public static BeybladeStart beybladeStart = new BeybladeStart();
    public static BeybladeEnd beybladeEnd = new BeybladeEnd();
  
    public static double LeftLockedY = 0;
    public static double RightLockedY = 0;
    public static boolean LockControls = false;

    public static boolean BeybladeSpinning = false;

    // This should be at the end, otherwise it will cause an error
    public static OI m_oi = new OI();
}
