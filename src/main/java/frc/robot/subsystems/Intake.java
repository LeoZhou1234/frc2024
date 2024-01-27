package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants.IntakeState;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Intake extends SubsystemBase{
    private CANSparkFlex m1;
    private CANSparkFlex m2;
    private IntakeState IntakeState;

    public void intake() {
        m1 = new CANSparkFlex(1, MotorType.kBrushless);
        m2 = new CANSparkFlex(1, MotorType.kBrushless);
        m2.follow(m1);
        m2.setInverted(true);
    }

    @Override
    public void periodic() {
        m1.set(IntakeState.speed);
    }

    public void setState(IntakeState state) {
        IntakeState = state;
    }
}

