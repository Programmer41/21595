package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@Autonomous(name = "auto", group = "Linear Opmode")
public class auto extends LinearOpMode {


    private DcMotor FL = null;
    private DcMotor BL = null;
    private DcMotor FR = null;
    private DcMotor BR = null;

    private Servo servoOne = null;
    private Servo servoTwo = null;


    @Override
    public void runOpMode() throws InterruptedException {

        FL = hardwareMap.get(DcMotor.class, "FL");
        BL = hardwareMap.get(DcMotor.class, "BL");
        FR = hardwareMap.get(DcMotor.class, "FR");
        BR = hardwareMap.get(DcMotor.class, "BR");

        servoOne = hardwareMap.get(Servo.class, "servoOne");
        servoTwo = hardwareMap.get(Servo.class, "servoTwo");

        FL.setDirection(DcMotorSimple.Direction.REVERSE);
        BL.setDirection(DcMotorSimple.Direction.REVERSE);

        servoOne.setPosition(0.50);
        servoTwo.setPosition(0.75);

        waitForStart();

        servoOne.setPosition(0.50);
        servoTwo.setPosition(0.75);
        
            FL.setPower(0.5);
            BL.setPower(0.5);
            FR.setPower(0.5);
            BR.setPower(0.5);

            Thread.sleep(500);

            FL.setPower(0);
            BL.setPower(0);
            FR.setPower(0);
            BR.setPower(0);



    }
}
