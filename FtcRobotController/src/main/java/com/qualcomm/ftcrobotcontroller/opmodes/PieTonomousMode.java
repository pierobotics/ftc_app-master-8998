package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by robots on 12/22/2015.
 */
public class PieTonomousMode extends MainHardware {
    private int state;

    @Override
    public void loop() {
        switch (state){
            case 0:
                set_drive_power(1.0, 1.0);
                new counter(3000);
                runner++;
                state ++;
                break;

            case 1:
                set_drive_power(1.0, -1.0);
                new counter(3000);
                runner++;
                state ++;
                break;

            case 2:
                set_servo_power(1.0, 0.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 3:
                if (runner == 0){
                    state++;
                }



            default:
                break;
        }

    }
}



