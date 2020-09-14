/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eftomi.mvn.steelslittingcalculator;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class SlittingEditor {

    private String titleMain;
    private String titleCalc;
    private String titleAbout;
    private Component rootPane;

    //for calculation other
    private double oneMmCoil;
    private double oneMmBatch;
    private int halfInnerDiameter;
    private int rewinderDrumWeight;
    private int oneCoilNetWeight;
    private int[] coilWithDrumRad = new int[ValMain.pickingNum.getDefault()];
    private int[] coilNetPlusDrumWeight = new int[ValMain.pickingNum.getDefault()];
    private boolean noCoilWidth = false;

    //setters
    public void setTitleMain(String titleMain) {
        this.titleMain = titleMain;
    }

    public void setTitleCalc(String titleCalc) {
        this.titleCalc = titleCalc;
    }

    public void setTitleAbout(String titleAbout) {
        this.titleAbout = titleAbout;
    }

    //setters for Test
    public void setHalfInnerDiameter(int halfInnerDiameter) {
        this.halfInnerDiameter = halfInnerDiameter;
    }

    public void setOneCoilNetWeight(int oneCoilNetWeight) {
        this.oneCoilNetWeight = oneCoilNetWeight;
    }

    public void setRewinderDrumWeight(int rewinderDrumWeight) {
        this.rewinderDrumWeight = rewinderDrumWeight;
    }

    public void setCoilNetPlusDrumWeight(int[] coilNetPlusDrumWeight) {
        this.coilNetPlusDrumWeight = coilNetPlusDrumWeight;
    }

    public void setCoilWithDrumRad(int[] coilWithDrumRad) {
        this.coilWithDrumRad = coilWithDrumRad;
    }

    public void setNoCoilWidth(boolean noCoilWidth) {
        this.noCoilWidth = noCoilWidth;
    }

    public void setOneMmBatch(double oneMmBatch) {
        this.oneMmBatch = oneMmBatch;
    }

    public void setOneMmCoil(double oneMmCoil) {
        this.oneMmCoil = oneMmCoil;
    }

    //getters
    public boolean isNoCoilWidth() {
        return noCoilWidth;
    }
    
    // temporary
    public String getTitleMain() {
        return titleMain;
    }

    public String getTitleCalc() {
        return titleCalc;
    }

    public String getTitleAbout() {
        return titleAbout;
    }

    public Component getRootPane() {
        return rootPane;
    }

    public double getOneMmCoil() {
        return oneMmCoil;
    }

    public double getOneMmBatch() {
        return oneMmBatch;
    }

    public int getHalfInnerDiameter() {
        return halfInnerDiameter;
    }

    public int getRewinderDrumWeight() {
        return rewinderDrumWeight;
    }

    public int getOneCoilNetWeight() {
        return oneCoilNetWeight;
    }

    public int[] getCoilWithDrumRad() {
        return coilWithDrumRad;
    }

    public int[] getCoilNetPlusDrumWeight() {
        return coilNetPlusDrumWeight;
    }

    //language switch for title
    public String setTitle(String nav) {
        switch (nav) {
            case "main":
                return titleMain;
            case "calc":
                return titleCalc;
            case "about":
                return titleAbout;
        }
        return null;
    }

    //methods for filtering
    public int filterInt(String numString, String[] mwNumber, String[] mwValue, 
            int[] tolerances) {
        Integer num = null;
        boolean oor;
        do {
            do {
                try {
                    num = Integer.parseInt(numString);
                } catch (NumberFormatException ex) {
                    numString = JOptionPane.showInputDialog(rootPane, mwNumber[1], 
                            mwNumber[0], JOptionPane.OK_OPTION);
                }
            } while (num == null);
            oor = (num < tolerances[0] || num > tolerances[1]);
            if (oor) {
                numString = JOptionPane.showInputDialog(rootPane, 
                        mwValue[1] + tolerances[0] + " - " + tolerances[1], 
                        mwValue[0], JOptionPane.OK_OPTION);
                num = null;
            }
        } while (oor);
        return num;
    }

    public double filterDouble(String numString, String[] mwNumber, 
            String[] mwValue, double[] tolerances) {
        Double num = null;
        boolean oor;
        do {
            do {
                try {
                    num = Double.parseDouble(numString.replace(',', '.'));
                } catch (NumberFormatException ex) {
                    numString = JOptionPane.showInputDialog(rootPane, mwNumber[1], 
                            mwNumber[0], JOptionPane.OK_OPTION);
                }
            } while (num == null);
            oor = (num < tolerances[0] || num > tolerances[1]);
            if (oor) {
                numString = JOptionPane.showInputDialog(rootPane, 
                        mwValue[1] + tolerances[0] + " - " + tolerances[1], 
                        mwValue[0], JOptionPane.OK_OPTION);
                num = null;
            }
        } while (oor);
        return num;
    }

        public double filterDoubleAndZero(String numString, String[] mwNumber, 
                String[] mwValue, double[] tolerances) {
        Double num = null;
        boolean oor;
        do {
            do {
                try {
                    num = Double.parseDouble(numString.replace(',', '.'));
                } catch (NumberFormatException ex) {
                    numString = JOptionPane.showInputDialog(rootPane, mwNumber[1], 
                            mwNumber[0], JOptionPane.OK_OPTION);
                }
            } while (num == null);
            oor = ((num < tolerances[0] || num > tolerances[1]) && num != 0);
            if (oor) {
                numString = JOptionPane.showInputDialog(rootPane, 
                        mwValue[1] + tolerances[0] + " - " + tolerances[1], 
                        mwValue[0], JOptionPane.OK_OPTION);
                num = null;
            }
        } while (oor);
        return num;
    }

    //methods for calculation
    public double oneCoilWeightCalc(double coilsWeight, int theBatch) {
        return coilsWeight / theBatch;
    }

    public void oneMmCoilCalc(double oneCoilWeight, int widthOfRaw, int defect) {
        oneMmCoil = (oneCoilWeight / widthOfRaw) * (100 - defect) / 100;
    }

    public void oneMmBatchCalc(double coilsWeight, int widthOfRaw, int defect) {
        oneMmBatch = (coilsWeight / widthOfRaw) * (100 - defect) / 100;
    }

    public void halfInnerDiameterCalc(int innerDiameter) {
        halfInnerDiameter = innerDiameter / 2;
    }

    public void rewinderDrumWeightCalc(int widthOfRaw) {
        rewinderDrumWeight = (int) ((Math.pow(halfInnerDiameter, 2) * Math.PI * 
                widthOfRaw * ValDouble.steelSpecificGravity.getDefault()) / 1000000);
    }

    public void oneCoilNetWeightCalc(double oneCoilWeight, int defect) {
        oneCoilNetWeight = (int) (oneCoilWeight * 1000 * (100 - defect) / 100);
    }

    public void coilNetPlusDrumWeightCalc() {
        for (int i = 0; i < ValMain.pickingNum.getDefault(); i++) {
            coilNetPlusDrumWeight[i] = oneCoilNetWeight / (i + 1) + rewinderDrumWeight;
        }
    }

    public void coilWithDrumRadCalc(int widthOfRaw) {
        for (int i = 0; i < ValMain.pickingNum.getDefault(); i++) {
            coilWithDrumRad[i] = (int) (Math.sqrt(coilNetPlusDrumWeight[i]) / 
                    Math.sqrt(Math.PI * widthOfRaw * 
                            ValDouble.steelSpecificGravity.getDefault()) * 1000);
        }
    }

    public int[] outerDiameterCalc() {
        int[] tempOuterDiameter = new int[ValMain.pickingNum.getDefault()];
        for (int i = 0; i < tempOuterDiameter.length; i++) {
            if (noCoilWidth) {
                tempOuterDiameter[i] = 0;
            } else {
                tempOuterDiameter[i] = coilWithDrumRad[i] * 2;
            }
        }
        return tempOuterDiameter;
    }

    public int[] bodyThicknessCalc(int[] outerDiameter, int innerDiameter) {
        int[] tempBodyThickness = new int[ValMain.pickingNum.getDefault()];
        for (int i = 0; i < tempBodyThickness.length; i++) {
            if (noCoilWidth) {
                tempBodyThickness[i] = 0;
            } else {
                tempBodyThickness[i] = (outerDiameter[i] - innerDiameter) / 2;
            }
        }
        return tempBodyThickness;
    }

    public double[] dimensionSumWidthCalc(int[] dimensionQty, double[] dimensionWidth) {
        double[] tempDimensionSumWidth = new double[ValMain.dimensionNum.getDefault()];
        for (int i = 0; i < tempDimensionSumWidth.length; i++) {
            tempDimensionSumWidth[i] = dimensionQty[i] * dimensionWidth[i];
        }
        return tempDimensionSumWidth;
    }

    public double[] dimensionSumWeightCalc(double[] dimensionSumWidth) {
        double[] tempDimensionSumWeight = new double[ValMain.dimensionNum.getDefault()];
        for (int i = 0; i < tempDimensionSumWeight.length; i++) {
            tempDimensionSumWeight[i] = dimensionSumWidth[i] * oneMmBatch;
        }
        return tempDimensionSumWeight;
    }

    public double[] dimensionSumProportionCalc(double[] dimensionSumWidth, int widthOfRaw) {
        double[] tempDimensionSumProportion = new double[ValMain.dimensionNum.getDefault()];
        for (int i = 0; i < tempDimensionSumProportion.length; i++) {
            tempDimensionSumProportion[i] = (dimensionSumWidth[i] / widthOfRaw * 100);
        }
        return tempDimensionSumProportion;
    }

    public int sumQtyCalc(int[] dimensionQty) {
        int sumQty = 0;
        for (int i = 0; i < dimensionQty.length; i++) {
            sumQty += dimensionQty[i];
        }
        return sumQty;
    }

    public double sumSumWidthCalc(double[] dimensionSumWidth) {
        double sumSumWidth = 0;
        for (int i = 0; i < dimensionSumWidth.length; i++) {
            sumSumWidth += dimensionSumWidth[i];
        }
        return sumSumWidth;
    }

    public void noCoilWidthSetup(double sumSumWidth, int widthOfRaw) {
        if (sumSumWidth > widthOfRaw) {
            noCoilWidth = true;
        } else {
            noCoilWidth = false;
        }
    }

    public double sumSumWeightCalc(double[] dimensionSumWeight) {
        double sumSumWeight = 0;
        if (!noCoilWidth) {
            for (int i = 0; i < dimensionSumWeight.length; i++) {
                sumSumWeight += dimensionSumWeight[i];
            }
        }
        return sumSumWeight;
    }

    public double sumSumProportionCalc(double[] dimensionSumProportion) {
        double sumSumProportion = 0;
        if (!noCoilWidth) {
            for (int i = 0; i < dimensionSumProportion.length; i++) {
                sumSumProportion += dimensionSumProportion[i];
            }
        }
        return sumSumProportion;
    }

    public double wasteEdgeWidthCalc(int widthOfRaw, double sumSumWidth) {
        if (sumSumWidth > widthOfRaw) {
            return 0;
        } else {
            return (widthOfRaw - sumSumWidth) / 2;
        }
    }

    public double remainsFromWidthCalc(int widthOfRaw, double sumSumWidth, int edgeMin) {
        double remainsFromWidth= (widthOfRaw - sumSumWidth) - edgeMin * 2;
        if (remainsFromWidth < 0) {
            remainsFromWidth = 0;
        }
        return remainsFromWidth;
    }

    public double sumWasteCalc(double coilsWeight, double sumSumWeight) {
        if (noCoilWidth) {
            return 0;
        } else {
            return coilsWeight - sumSumWeight;
        }
    }

    public double[][] dimensionPickCalc(int[] dimensionQty, double[] dimensionWidth) {
        double[][] tempDimensionPick = 
                new double[ValMain.dimensionNum.getDefault()][ValMain.pickingNum.getDefault()];
        for (int i = 0; i < tempDimensionPick.length; i++) {
            for (int j = 0; j < tempDimensionPick[i].length; j++) {
                if (dimensionQty[i] == 0) {
                    tempDimensionPick[i][j] = 0;
                } else if (noCoilWidth) {
                    tempDimensionPick[i][j] = 0;
                } else {
                    tempDimensionPick[i][j] = (double) Math.round(dimensionWidth[i] / 
                            (j + 1) * oneMmCoil * 10000) / 10000;
                }
            }
        }
        return tempDimensionPick;
    }

    public String dimensionResultDisplay(int[] dimensionQty, double[] dimensionWidth) {
        String dimensionResult = "";
        for (int i = 0; i < dimensionQty.length; i++) {
            if (i > 0) {
                if (dimensionQty[i] > 0 && dimensionWidth[i] > 0 && dimensionQty[i - 1] 
                        > 0 && dimensionWidth[i - 1] > 0) {dimensionResult += " + ";
                }
            }
            if (dimensionQty[i] > 0 && dimensionWidth[i] > 0) {
                dimensionResult += dimensionQty[i] + " * " + dimensionWidth[i] + "mm";
            }
        }
        return dimensionResult;
    }
}
