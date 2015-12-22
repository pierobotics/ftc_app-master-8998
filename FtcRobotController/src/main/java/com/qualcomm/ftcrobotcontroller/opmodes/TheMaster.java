package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by robots on 11/13/2015. Edited Last 11/25/15
 */
public class TheMaster extends OpMode{
    private DcMotor Motor1;
    private DcMotor Motor2;
    private DcMotor Motor3;
    private DcMotor Motor4;
    private Servo servo1;
    private Servo servo2;
    private Servo servo3;
    private Servo servo4;
    private Servo servo5;



    @Override
    public void init() {
        Motor1 = hardwareMap.dcMotor.get("motor1");
        Motor2 = hardwareMap.dcMotor.get("motor2");
        Motor3 = hardwareMap.dcMotor.get("motor3");
        Motor4 = hardwareMap.dcMotor.get("motor4");
        Motor2.setDirection(DcMotor.Direction.REVERSE);
        Motor4.setDirection(DcMotor.Direction.REVERSE);
        servo1 = hardwareMap.servo.get("servo1");
        servo2 = hardwareMap.servo.get("servo2");

    }

    @Override
    public void loop() {
        Motor1.setPower(gamepad1.left_stick_y);
        Motor2.setPower (gamepad1.right_stick_y);
        Motor3.setPower (gamepad1.left_stick_y);
        Motor4.setPower(gamepad1.right_stick_y);

        if (gamepad2.a){
            servo1.setPosition(Servo.MAX_POSITION);
        }
        if (gamepad2.b){
            servo1.setPosition(Servo.MIN_POSITION);
        }


        if (gamepad2.x){
            servo2.setPosition(Servo.MAX_POSITION);
        }
        if (gamepad2.y){
            servo2.setPosition(Servo.MIN_POSITION);
        }





    }
}

