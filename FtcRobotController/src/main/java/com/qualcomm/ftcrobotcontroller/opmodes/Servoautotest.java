package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by robots on 12/19/2015.
 */
public class Servoautotest extends MainHardware {
    private int state;

    @Override
    public void loop() {
        switch (state){
            case 0:
                servo_set_power(1.0,0.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 1:
                servo_set_power(1.0,0.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 2:
                servo_set_power(0.0,1.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 3:
                servo_set_power(1.0,0.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 4:
                servo_set_power(0.0,1.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 5:
                servo_set_power(1.0,0.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 6:
                servo_set_power(0.0,1.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 7:
                servo_set_power(1.0,0.0);
                new counter(1000);
                runner++;
                state ++;
                break;

            case 8:
                if (runner == 0){
                    state++;
                }


            default:
                break;
        }

    }
}



