/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eftomi.mvn.steelslittingcalculator;

/**
 *
 * @author
 */
public enum ValInt {
    //min, max, default
    widthOfRaw(19, 1550, 1015),
    theBatch(1, 99, 1),
    edgeMin(0, 5, 5),
    edgeMax(6, 60, 15),
    defect(0, 20, 5),
    dimensionQty(0, 15, 0);
    
    private int[] tolerances = new int[2];
    private int def;

    ValInt(int min, int max, int def) {
        this.tolerances[0] = min;
        this.tolerances[1] = max;
        this.def = def;

    }

    public int[] getTolerances() {
        return tolerances;
    }

    public int getDefault() {
        return def;
    }

}
