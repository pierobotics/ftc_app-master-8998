package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by robots on 1/6/2016.
 */
public class AutoTimeMode1 extends MainHardware {

    @Override
    public void loop() {

        // turning speed: 0.6 spd for 0.8 second for 90 degrees
        // forward speed: 1.0 spd for 1.25 second for 2 ft ( 1 block)


        if (this.time > 1.00 && this.time <= 4.00) {
            set_drive_power(-1.0, -1.0);
        }
        else if (this.time > 4.20 && this.time <= 4.80) {
            set_drive_power(-0.2, 0.2);
        }
        else if (this.time > 5.00 && this.time <= 6.00) {
            set_drive_power(-1.0, -1.0);
        }
        else {
            set_drive_power(0.0, 0.0);
            telemetry.addData("finished" , "auto" );
        }
        telemetry.addData("time", "running: " + Double.toString(this.time));

    }
}