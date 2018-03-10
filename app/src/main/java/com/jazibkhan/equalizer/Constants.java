package com.jazibkhan.equalizer;

/**
 * Created by Jazib on 2/11/2018.
 */

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.jazibkhan.equalizer.action.main";
        public static String STARTFOREGROUND_ACTION = "com.jazibkhan.foregroundservice.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.jazibkhan.foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}