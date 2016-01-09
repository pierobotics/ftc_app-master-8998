package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
/**
 * Created by robots on 10/23/2015.
 */
public class moter123  extends OpMode{
    private DcMotor Motor1;
    private DcMotor Motor2;
    private Servo servo1;

    @Override
    public void init() {
        Motor1 = hardwareMap.dcMotor.get("Motor1");
        Motor2 = hardwareMap.dcMotor.get("Motor2");
        Motor1.setDirection(DcMotor.Direction.REVERSE);


    }

    @Override
    public void loop() {
        if (gamepad1.a){
            servo1.setPosition(Servo.MAX_POSITION);
        }
        if (gamepad1.b) {
            servo1.setPosition(Servo.MIN_POSITION);
        }
        Motor1.setPower (gamepad1.left_stick_y);
        Motor2.setPower (gamepad1.right_stick_y);



    }

}
