package controller;

import java.util.concurrent.TimeUnit;

public class Timer {
   public static void time(int i){
        try{
            TimeUnit.MILLISECONDS.sleep(i);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
