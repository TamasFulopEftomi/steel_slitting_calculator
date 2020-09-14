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
public enum ValDouble {
    //min, max, default
    steelSpecificGravity(0, 0, 7.855),
    coilsWeight(0.1, 999, 10),
    dimensionWidth(19, 1530, 19);
    
    private double[] tolerances = new double[2];
    private double def;

    ValDouble(double min, double max, double def) {
        this.tolerances[0] = min;
        this.tolerances[1] = max;
        this.def = def;

    }

    public double[] getTolerances() {
        return tolerances;
    }

    public double getDefault() {
        return def;
    }

}
