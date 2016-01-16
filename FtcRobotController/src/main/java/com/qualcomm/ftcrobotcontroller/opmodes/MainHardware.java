package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by robots on 12/19/2015.
 */
public class MainHardware extends OpMode {
    //Servo servo1;
    //Servo servo2;
    DcMotor dropper;
    DcMotor left1;
    DcMotor right1;
    DcMotor left2;
    DcMotor right2;
    DcMotor shovel;
    static int runner;

    @Override
    public void init() {

        //servo2 = hardwareMap.servo.get("servo2");
        //servo1 = hardwareMap.servo.get("servo1");
        left1 = hardwareMap.dcMotor.get("motor1");
        right1 = hardwareMap.dcMotor.get("motor2");
        left2 = hardwareMap.dcMotor.get("motor3");
        right2 = hardwareMap.dcMotor.get("motor4");
        left1.setDirection(DcMotor.Direction.REVERSE);
        left2.setDirection(DcMotor.Direction.REVERSE);
        dropper = hardwareMap.dcMotor.get("dropper");
        shovel = hardwareMap.dcMotor.get("shovel");
    }

    @Override
    public void loop() {

    }
    public void set_drive_power (double lt , double rt){
        left1.setPower(lt);
        right1.setPower(rt);
        left2.setPower(lt);
        right2.setPower(rt);
    }

    public void set_dropper_power (double arm ) {
        dropper.setPower(arm);
    }
    public void set_shovel_power (double shovel ) {
        shovel.setPower(shovel);
    }


        //public void set_servo_power ( double MAX_POSITION, double MIN_POSITION){
        {
            //servo1.setPosition(MAX_POSITION);
            //servo1.setPosition(MIN_POSITION);


            try{
                dropper = hardwareMap.dcMotor.get("dropper");
            }
            catch (Exception p_exception){
                dropper = null;
            }


        }
    }
