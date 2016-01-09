package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by robots on 1/6/2016.
 */
public class AutoTimeMode extends MainHardware {

    @Override
    public void loop() {

        // turning speed: 0.6 spd for 0.8 second for 90 degrees
        // forward speed: 1.0 spd for 1.25 second for 2 ft ( 1 block)


        if (this.time > 1.00 && this.time <= 5.00) {
            set_drive_power(1.0, 1.0);
        }
        else if (this.time > 5.20 && this.time <= 5.60) {
            set_drive_power(0.2, -0.2);
        }
        else if (this.time > 6.00 && this.time <= 7.00) {
            set_drive_power(1.0, 1.0);
        }
        else if (this.time > 10.00 && this.time <= 11.00) {
            set_drive_power(-1.0, -1.0);
        }
        else if (this.time > 20.00 && this.time <= 20.5) {
            set_drive_power(1.0, 1.0);
        }

        else {
            set_drive_power(0.0, 0.0);
        }
            telemetry.addData("program finish", "YAY: " + Double.toString(this.time));

    }
}