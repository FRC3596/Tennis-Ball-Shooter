package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMVictorSPX;

import frc.robot.commands.Wait;

public class ShooterSub extends SubsystemBase {
    private static final DoubleSolenoid loadPiston = new DoubleSolenoid(1, 2);
    private static final PWMVictorSPX ShootMtr1 = new PWMVictorSPX(2);
    private static final PWMVictorSPX ShootMtr2 = new PWMVictorSPX(3);

    public ShooterSub()
    {
        // Reverses the pistion movement
        loadPiston.set(Value.kReverse);
        
        // Wait 10 seconds - 1000ms == 1 second
        Wait.Delay(10000);

        // Deactivate the pistion
        loadPiston.set(Value.kOff);
    }

    public void Fire()
    { 
        // Activate shooter motors and set them to max value
        ShootMtr1.set(1);
        ShootMtr2.set(1);
        // Make the piston move forward
        loadPiston.set(Value.kForward);

        // Wait for 1 second
        Wait.Delay(1000);

        // Deactivate both motors
        ShootMtr1.set(0);
        ShootMtr2.set(0);
        // Reverse the pistion
        loadPiston.set(Value.kReverse);

        // Wait 1 second
        Wait.Delay(1000);

        // Deactivate the pistion
        loadPiston.set(Value.kOff);
    }
}
