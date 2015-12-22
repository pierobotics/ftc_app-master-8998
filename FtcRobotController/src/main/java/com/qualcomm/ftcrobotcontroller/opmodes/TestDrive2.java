package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by robots on 12/19/2015.
 */
public class TestDrive2 extends OpMode {
    private DcMotor left1;
    private DcMotor right1;
    private DcMotor left2;
    private DcMotor right2;
    private Servo servo1;

    @Override
    public void init() {
        left1 = hardwareMap.dcMotor.get("motor1");
        right1 = hardwareMap.dcMotor.get("motor2");
        left2 = hardwareMap.dcMotor.get("motor3");
        right2 = hardwareMap.dcMotor.get("motor4");
        left1.setDirection(DcMotor.Direction.REVERSE);
        left2.setDirection(DcMotor.Direction.REVERSE);
        servo1 = hardwareMap.servo. get("servo1");
        System.out.println("hiinti");



    }

    @Override
    public void loop() {
        left1.setPower(gamepad1.left_stick_y);
        left2.setPower(gamepad1.left_stick_y);
        right1.setPower(gamepad1.right_stick_y);
        right2.setPower(gamepad1.right_stick_y);
        System.out.println("hi");


        if(gamepad1.left_bumper) {
            servo1.setPosition(Servo.MAX_POSITION);
        }

        if(gamepad1.right_bumper) {
            servo1.setPosition(Servo.MIN_POSITION);
        }




        }

    }

