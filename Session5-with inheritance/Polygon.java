package com.company;

import java.util.ArrayList;

/**
 * The type Polygon.
 */
public  abstract class Polygon extends Shape{
    private ArrayList<Integer> sides;

    /**
     * Instantiates a new Polygon.
     *add side to sides
     * @param side the side
     */
    public Polygon(int... side) {
        sides = new ArrayList<>();
        for (int s : side) {
            this.sides.add(s);
        }
    }

    /**
     * Gets sides.
     *
     * @return the sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

}
