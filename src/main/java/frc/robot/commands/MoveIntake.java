package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class MoveIntake extends CommandBase 
{
    private final double speed;

    public MoveIntake(final double speed)
    {
        this.speed = speed;
    }
@Override
public void initialize()
{
    RobotContainer.getIntake().moveIntake(speed);
}

}