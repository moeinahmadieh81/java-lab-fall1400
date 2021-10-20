package com.company;

/**
 * The type Number display.
 */
public class NumberDisplay {
    private int limit;
    private int value;

    /**
     * Instantiates a new Number display.
     *
     * @param rollOverLimit the roll over limit
     */
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param replacementValue the replacement value
     */
    public void setValue(int replacementValue) {
        if ((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }

    /**
     * Gets display value.
     *
     * @return the display value
     */
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    /**
     * Increment.
     */
    public void increment() {
        value = (value + 1) % limit;
    }

}
