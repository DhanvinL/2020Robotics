package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Hatch;

public class MoveHatch extends CommandBase
{
    private final Hatch hatch;
    public MoveHatch(Hatch hatch)
    {
        this.hatch = hatch;
    }


    public void hatch() {
        hatch.HatchMove();
    }

    public boolean isFinished() {
        return true;
    }
}