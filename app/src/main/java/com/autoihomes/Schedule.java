package com.autoihomes;

/**
 * Created by smarhas on 5/23/2018.
 */

public class Schedule{
    String controllerName;
    String deviceName;
    String action;
    String time;

    public String getDeviceName() {
        return deviceName;
    }

    public String getAction() {

        return action;
    }

    public String getTime() {
        return time;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        Schedule schedule=(Schedule)o;
        return (this.controllerName+this.deviceName+this.action+this.time)
                .equals(schedule.controllerName+schedule.deviceName+schedule.action+schedule.time);
    }

    @Override
    public int hashCode() {
        return (this.controllerName+this.deviceName+this.action+this.time).hashCode();
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "controllerName='" + controllerName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", action='" + action + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
