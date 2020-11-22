package frc.robot;

import edu.wpi.first.wpilibj.PWMVictorSPX;

public class SteelTalonsController extends PWMVictorSPX
{
    private boolean reverse;
    private double bias;


    public SteelTalonsController(int channel, boolean reverse, double bias) 
      {
        super(channel);
        this.reverse = reverse;
        this.bias = bias;

      }	
      @Override
      public void set(double speed)
      {

        super.set(speed * bias);
      }

    
}