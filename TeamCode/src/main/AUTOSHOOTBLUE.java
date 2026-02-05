package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "autoBLUE", group = "Linear Opmode")
public class AUTOSHOOTBLUE extends LinearOpMode {

    private DcMotor FL = null;
    private DcMotor BL = null;
    private DcMotor FR = null;
    private DcMotor BR = null;

    private DcMotor ShooterMotor1 = null;

    private DcMotor ShooterMotor2 = null;

    private Servo servoOne, servoTwo;

    @Override
    public void runOpMode() throws InterruptedException {

        FL = hardwareMap.get(DcMotor.class, "FL");
        BL = hardwareMap.get(DcMotor.class, "BL");
        FR = hardwareMap.get(DcMotor.class, "FR");
        BR = hardwareMap.get(DcMotor.class, "BR");
        ShooterMotor1 = hardwareMap.get(DcMotor.class, "ShooterMotor1");
        ShooterMotor2 = hardwareMap.get(DcMotor.class, "ShooterMotor2");

        servoOne = hardwareMap.get(Servo.class, "servoOne");
        servoTwo = hardwareMap.get(Servo.class, "servoTwo");

        servoTwo.setDirection(Servo.Direction.REVERSE);
        servoOne.setDirection(Servo.Direction.FORWARD);

        servoOne.setPosition(0.50);
        servoTwo.setPosition(0.75);


        FL.setDirection(DcMotorSimple.Direction.REVERSE);
        BL.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        FL.setDirection(DcMotorSimple.Direction.FORWARD);
        BL.setDirection(DcMotorSimple.Direction.FORWARD);
        FR.setDirection(DcMotorSimple.Direction.REVERSE);
        BR.setDirection(DcMotorSimple.Direction.REVERSE);

        ShooterMotor1.setPower(1);

        FL.setPower(0.5);
        BL.setPower(0.5);
        FR.setPower(0.5);
        BR.setPower(0.5);

        Thread.sleep(1800);

        FL.setPower(0);
        BL.setPower(0);
        FR.setPower(0);
        BR.setPower(0);

        servoOne.setPosition(0.2);
        servoTwo.setPosition(0.5);


        sleep(4000);

        ShooterMotor2.setDirection(DcMotorSimple.Direction.REVERSE);

        ShooterMotor2.setPower(1);

        sleep(4000);

        FL.setDirection(DcMotorSimple.Direction.FORWARD);
        BL.setDirection(DcMotorSimple.Direction.REVERSE);
        FR.setDirection(DcMotorSimple.Direction.FORWARD);
        BR.setDirection(DcMotorSimple.Direction.REVERSE);

        FL.setPower(0.5);
        BL.setPower(0.5);
        FR.setPower(0.5);
        BR.setPower(0.5);

        Thread.sleep(1000);

        FL.setPower(0);
        BL.setPower(0);
        FR.setPower(0);
        BR.setPower(0);

        ShooterMotor1.setPower(0);
        ShooterMotor2.setPower(0);
    }
}
