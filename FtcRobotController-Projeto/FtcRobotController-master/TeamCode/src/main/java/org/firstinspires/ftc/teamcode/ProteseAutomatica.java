package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="desafio1", group="Linear OpMode")
public class ProteseAutomatica extends LinearOpMode {

    private DcMotor Motor;
    private Servo servobraco;
    @Override
    public void runOpMode() {

        Motor = hardwareMap.get(DcMotor.class, "motor_base");
        servobraco = hardwareMap.get(Servo.class, "");
        Motor.setDirection(DcMotorSimple.Direction.FORWARD);
        Motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        ElapsedTime contador = new ElapsedTime(ElapsedTime.Resolution.MILLISECONDS);

        waitForStart();


        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            contador.reset();



        }

    }

}
