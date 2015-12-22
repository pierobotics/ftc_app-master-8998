package com.qualcomm.ftcrobotcontroller.opmodes;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by robots on 12/4/2015.
 */
public class counter  extends hardware{
    Timer timer;

    public counter(int miliseconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), miliseconds);
    }

    class RemindTask extends TimerTask {
        public void run() {
            set_drive_power(0.0, 0.0);
            //ac_servo.setPosition(Servo.MIN_POSITION);
            runner--;
            timer.cancel(); //Terminate the timer thread

        }
    }
}
