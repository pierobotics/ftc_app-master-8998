package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by robots on 1/15/2016.
 */
public class PieDriving extends MainHardware {


    @Override
    public void loop() {
        left1.setPower(gamepad1.left_stick_y);
        right1.setPower(gamepad1.right_stick_y);
        left2.setPower(gamepad1.left_stick_y);
        right2.setPower(gamepad1.right_stick_y);

        if (gamepad2.dpad_down) {
            set_dropper_power(0.2);
        }
        if (gamepad2.dpad_up) {
            set_dropper_power(-0.2);
        }

        else set_dropper_power(0.0);
        {

        }
        if (gamepad2.y) {
            set_shovel_power(2.0);
        }
        if (gamepad2.x) {
            set_shovel_power(-2.0);
        }
        else set_shovel_power(0.0);







    }
    }
