package controller;

import controller.Mark;
import controller.Timer;

public class Clear {
 

    public static void clean(int key){
        Timer sleep = new Timer();
        Mark mar = new Mark();
        for(;key>=0;key--){
            sleep.time(10);
            mar.marca("");
        }
    }
}
