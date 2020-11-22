package frc.robot.subsystems;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase
{
    private SpeedController left;
    private final SpeedController right;

    public Intake(SpeedController left, final SpeedController Right) {
        left = l;
        right = r;
    }

    public void moveIntake(final double speed)
    {
        left.set(speed);
        right.set(speed);
    }
    
    public void stop()
    {
        left.stopMotor();
        right.stopMotor();
    }

    


}