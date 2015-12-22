package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by robots on 12/4/2015.
 */
public class PIeTominsB extends MainHardware{
    private int state;

    @Override
    public void loop() {
        switch (state){
            case 0:
                set_drive_power(1.0, 1.0);
                new counter(1000);
                runner++;
                state ++;
                break;
            case 1:
                if (runner == 0){
                    state++;
                }



            default:
                break;
        }

    }
}





