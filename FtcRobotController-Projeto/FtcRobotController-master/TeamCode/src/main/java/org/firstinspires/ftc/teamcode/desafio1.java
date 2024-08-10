package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="desafio1", group="Linear OpMode")

public class desafio1 extends LinearOpMode {
    private DcMotor motor_base;
    private Servo servo_braco;



    @Override
    public void runOpMode() {
        motor_base = hardwareMap.get(DcMotor.class,"motor_base");
        servo_braco = hardwareMap.get(Servo.class,"servo_braco");
        motor_base.setDirection(DcMotor.Direction.FORWARD);

        motor_base.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        // run until the end of the match (driver presses STOP)


        // Implementar logica joystick

        /*while (opModeIsActive()) {
                servo_braco.setPosition((gamepad1.left_stick_y+1)/2.);

                if (gamepad1.x) {
                    motor_base.setTargetPosition(72);
                    motor_base.setPower(1);
                    motor_base.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                    motor_base.setMode(DcMotor.RunMode.RUN_TO_POSITION);

                }

                if (gamepad1.y){
                    motor_base.setTargetPosition(-72);
                    motor_base.setPower(1);
                    motor_base.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                    motor_base.setMode(DcMotor.RunMode.RUN_TO_POSITION);

                }

        }*/


    }


}