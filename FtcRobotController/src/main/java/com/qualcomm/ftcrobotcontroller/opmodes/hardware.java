package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by robots on 12/4/2015.
 */
public class hardware  extends OpMode{
    DcMotor left1;
    DcMotor right1;
    DcMotor left2;
    DcMotor right2;
    static int runner;
    @Override
    public void init() {
        left1 = hardwareMap.dcMotor.get("motor1");
        right1 = hardwareMap.dcMotor.get("motor2");
        left2 = hardwareMap.dcMotor.get("motor3");
        right2 = hardwareMap.dcMotor.get("motor4");
        left1.setDirection(DcMotor.Direction.REVERSE);
        left2.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {

    }
    public void set_drive_power (double lt , double rt){
        left1.setPower(lt);
        right1.setPower (rt);
        left2.setPower(lt);
        right2.setPower(rt);
    }
}
