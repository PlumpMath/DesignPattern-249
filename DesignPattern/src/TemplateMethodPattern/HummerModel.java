package TemplateMethodPattern;

abstract class HummerModel {

    boolean isAlarm = false;

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public abstract void setAlarm();

    public void run() {

        start();
        engineBoom();
        setAlarm();
        if (isAlarm)
            alarm();
        stop();
    }

    ;

}
