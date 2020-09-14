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
public enum ValMain {
    //default
    innerDiameter(500),
    dimensionNum(5),
    pickingNum(4);
    
    private int def;
    
    ValMain(int def) {
        this.def = def;
    }

    public int getDefault() {
        return def;
    }
    
    
}
