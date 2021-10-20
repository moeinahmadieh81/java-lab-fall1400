package com.company;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * The type Clock display.
 */
public class ClockDisplay {
    private NumberDisplay hour;
    private NumberDisplay minute;
    private NumberDisplay second;
    private String displayString;

    /**
     * Instantiates a new Clock display.
     */
    public ClockDisplay() {
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        second = new NumberDisplay(60);
        updateDisplay();

    }
    public ClockDisplay(int h, int m, int s){
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        second = new NumberDisplay(60);
        setTime(h, m, s);
    }

    /**
     * Sets time.
     *
     * @param h the h
     * @param m the m
     * @param s the s
     */
    public void setTime(int h, int m, int s) {
        hour.setValue(h);
        minute.setValue(m);
        second.setValue(s);
        updateDisplay();
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
        return displayString;
    }

    /**
     * Time tick.
     */
    public void timeTick() {
        second.increment();
        if(second.getValue() == 0){
            minute.increment();
            if (minute.getValue() == 0) {
                hour.increment();
            }
        }
        updateDisplay();
    }

    private void updateDisplay() {
        displayString = hour.getDisplayValue() + ":" + minute.getDisplayValue() + ":" + second.getDisplayValue();
    }
}
