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
    private DcMotor dropper;

    //private Servo servo1;
    //private Servo servo2;


    @Override
    public void init() {
        left1 = hardwareMap.dcMotor.get("motor1");
        right1 = hardwareMap.dcMotor.get("motor2");
        left2 = hardwareMap.dcMotor.get("motor3");
        right2 = hardwareMap.dcMotor.get("motor4");
        left1.setDirection(DcMotor.Direction.REVERSE);
        left2.setDirection(DcMotor.Direction.REVERSE);
        dropper = hardwareMap.dcMotor.get("dropper");
        //servo1 = hardwareMap.servo.get("servo1");
        //servo1.setPosition(Servo.MIN_POSITION);
        //servo2 = hardwareMap.servo.get("servo2");
        //servo2.setPosition(Servo.MIN_POSITION);

    }

    @Override
    public void loop() {
        left1.setPower(gamepad1.left_stick_y);
        left2.setPower(gamepad1.left_stick_y);
        right1.setPower(gamepad1.right_stick_y);
        right2.setPower(gamepad1.right_stick_y);

        dropper.setPower(gamepad2.right_stick_y);










        if (gamepad2.a){
          //  servo1.setPosition(Servo.MAX_POSITION);
        }

        if (gamepad2.b){
            //servo1.setPosition(Servo.MIN_POSITION);


        }
    }
}