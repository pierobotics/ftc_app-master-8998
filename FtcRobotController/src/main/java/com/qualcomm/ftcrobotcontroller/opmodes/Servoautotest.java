package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by robots on 12/19/2015.
 */
public class Servoautotest extends MainHardware {
    private int state;

    @Override
    public void loop() {

        if (this.time > 1.00 && this.time <= 5.00) {
           // set_servo_power(1.0, 0.0);
        }
        else if (this.time > 5.25 && this.time <= 7.00) {
            //set_servo_power(0.0, 1.0);
        }
        else {
           // set_servo_power(0.0, 0.0);
        }

        telemetry.addData("program finish", "YAY: " + Double.toString(this.time));

    }
}



