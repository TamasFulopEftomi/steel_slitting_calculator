/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.eftomi.mvn.steelslittingcalculator.SlittingEditor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class SlittingEditorTest {
    
    public SlittingEditor se;
    
    public SlittingEditorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        se = new SlittingEditor();
    }
    
    @After
    public void tearDown() {
    }

    //test methods language switch for title
    @Test
    public void testSetTitle1() {
        se.setTitleMain("English");
        assertEquals("English", se.setTitle("main"));
    }

    @Test
    public void testSetTitle2() {
        se.setTitleMain("Magyar");
        assertEquals("Magyar", se.setTitle("main"));
    }

    @Test
    public void testSetTitle3() {
        se.setTitleCalc("Calculator");
        assertEquals("Calculator", se.setTitle("calc"));
    }

    @Test
    public void testSetTitle4() {
        se.setTitleCalc("Méretszerkesztő");
        assertEquals("Méretszerkesztő", se.setTitle("calc"));
    }

    @Test
    public void testSetTitle5() {
        se.setTitleAbout("About");
        assertEquals("About", se.setTitle("about"));
    }

    @Test
    public void testSetTitle6() {
        se.setTitleAbout("A programról");
        assertEquals("A programról", se.setTitle("about"));
    }

    //test methods for methods for calculation
    @Test
    public void testOneCoilWeightCalc1() {
        assertEquals(0.6, se.oneCoilWeightCalc(0.6, 1), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc2() {
        assertEquals(15.4, se.oneCoilWeightCalc(15.4, 1), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc3() {
        assertEquals(20, se.oneCoilWeightCalc(20, 1), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc4() {
        assertEquals(0.0666, se.oneCoilWeightCalc(0.6, 9), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc5() {
        assertEquals(1.7111, se.oneCoilWeightCalc(15.4, 9), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc6() {
        assertEquals(2.2222, se.oneCoilWeightCalc(20, 9), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc7() {
        assertEquals(0.6818, se.oneCoilWeightCalc(60, 88), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc8() {
        assertEquals(1.75, se.oneCoilWeightCalc(154, 88), 0.0001);
    }

    @Test
    public void testOneCoilWeightCalc9() {
        assertEquals(2.2727, se.oneCoilWeightCalc(200, 88), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc1() {
        se.oneMmCoilCalc(10, 1015, 0);
        assertEquals(0.0098, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc2() {
        se.oneMmCoilCalc(10, 1265, 0);
        assertEquals(0.0079, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc3() {
        se.oneMmCoilCalc(10, 1515, 0);
        assertEquals(0.0066, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc4() {
        se.oneMmCoilCalc(10, 1015, 5);
        assertEquals(0.0093, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc5() {
        se.oneMmCoilCalc(15, 1265, 5);
        assertEquals(0.0112, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc6() {
        se.oneMmCoilCalc(15, 1515, 5);
        assertEquals(0.0094, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc7() {
        se.oneMmCoilCalc(20, 1015, 15);
        assertEquals(0.0167, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc8() {
        se.oneMmCoilCalc(20, 1265, 15);
        assertEquals(0.0134, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmCoilCalc9() {
        se.oneMmCoilCalc(20, 1515, 15);
        assertEquals(0.0112, se.getOneMmCoil(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc1() {
        se.oneMmBatchCalc(31, 1015, 0);
        assertEquals(0.0305, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc2() {
        se.oneMmBatchCalc(31, 1265, 0);
        assertEquals(0.0245, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc3() {
        se.oneMmBatchCalc(31, 1515, 0);
        assertEquals(0.0204, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc4() {
        se.oneMmBatchCalc(62, 1015, 5);
        assertEquals(0.058, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc5() {
        se.oneMmBatchCalc(62, 1265, 5);
        assertEquals(0.0465, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc6() {
        se.oneMmBatchCalc(62, 1515, 5);
        assertEquals(0.0388, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc7() {
        se.oneMmBatchCalc(93, 1015, 15);
        assertEquals(0.0778, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc8() {
        se.oneMmBatchCalc(93, 1265, 15);
        assertEquals(0.0624, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testOneMmBatchCalc9() {
        se.oneMmBatchCalc(93, 1515, 15);
        assertEquals(0.0521, se.getOneMmBatch(), 0.0001);
    }

    @Test
    public void testHalfInnerDiameterCalc1() {
        se.halfInnerDiameterCalc(500);
        assertEquals(250, se.getHalfInnerDiameter());
    }

    @Test
    public void testHalfInnerDiameterCalc2() {
        se.halfInnerDiameterCalc(610);
        assertEquals(305, se.getHalfInnerDiameter());
    }

    @Test
    public void testRewinderDrumWeightCalc1() {
        se.setHalfInnerDiameter(250);
        se.rewinderDrumWeightCalc(1015);
        assertEquals(1565, se.getRewinderDrumWeight());
    }

    @Test
    public void testRewinderDrumWeightCalc2() {
        se.setHalfInnerDiameter(250);
        se.rewinderDrumWeightCalc(1265);
        assertEquals(1951, se.getRewinderDrumWeight());
    }

    @Test
    public void testRewinderDrumWeightCalc3() {
        se.setHalfInnerDiameter(250);
        se.rewinderDrumWeightCalc(1515);
        assertEquals(2336, se.getRewinderDrumWeight());
    }

    @Test
    public void testRewinderDrumWeightCalc4() {
        se.setHalfInnerDiameter(305);
        se.rewinderDrumWeightCalc(1015);
        assertEquals(2330, se.getRewinderDrumWeight());
    }

    @Test
    public void testRewinderDrumWeightCalc5() {
        se.setHalfInnerDiameter(305);
        se.rewinderDrumWeightCalc(1265);
        assertEquals(2903, se.getRewinderDrumWeight());
    }

    @Test
    public void testRewinderDrumWeightCalc6() {
        se.setHalfInnerDiameter(305);
        se.rewinderDrumWeightCalc(1515);
        assertEquals(3477, se.getRewinderDrumWeight());
    }

    @Test
    public void testOneCoilNetWeightCalc1() {
        se.oneCoilNetWeightCalc(15.5, 0);
        assertEquals(15500, se.getOneCoilNetWeight());
    }

    @Test
    public void testOneCoilNetWeightCalc2() {
        se.oneCoilNetWeightCalc(15.5, 5);
        assertEquals(14725, se.getOneCoilNetWeight());
    }

    @Test
    public void testOneCoilNetWeightCalc3() {
        se.oneCoilNetWeightCalc(15.5, 15);
        assertEquals(13175, se.getOneCoilNetWeight());
    }

    @Test
    public void testOneCoilNetWeightCalc4() {
        se.oneCoilNetWeightCalc(21, 0);
        assertEquals(21000, se.getOneCoilNetWeight());
    }

    @Test
    public void testOneCoilNetWeightCalc5() {
        se.oneCoilNetWeightCalc(21, 5);
        assertEquals(19950, se.getOneCoilNetWeight());
    }

    @Test
    public void testOneCoilNetWeightCalc6() {
        se.oneCoilNetWeightCalc(21, 15);
        assertEquals(17850, se.getOneCoilNetWeight());
    }

    @Test
    public void testCoilNetPlusDrumWeightCalc1() {
        se.setOneCoilNetWeight(20000);
        se.setRewinderDrumWeight(3447);
        se.coilNetPlusDrumWeightCalc();
        assertArrayEquals(new int[]{23447, 13447, 10113, 8447}, se.getCoilNetPlusDrumWeight());
    }

    @Test
    public void testCoilNetPlusDrumWeightCalc2() {
        se.setOneCoilNetWeight(15000);
        se.setRewinderDrumWeight(2903);
        se.coilNetPlusDrumWeightCalc();
        assertArrayEquals(new int[]{17903, 10403, 7903, 6653}, se.getCoilNetPlusDrumWeight());
    }

    @Test
    public void testCoilNetPlusDrumWeightCalc3() {
        se.setOneCoilNetWeight(10000);
        se.setRewinderDrumWeight(2330);
        se.coilNetPlusDrumWeightCalc();
        assertArrayEquals(new int[]{12330, 7330, 5663, 4830}, se.getCoilNetPlusDrumWeight());
    }

    @Test
    public void testCoilNetPlusDrumWeightCalc4() {
        se.setOneCoilNetWeight(20000);
        se.setRewinderDrumWeight(2336);
        se.coilNetPlusDrumWeightCalc();
        assertArrayEquals(new int[]{22336, 12336, 9002, 7336}, se.getCoilNetPlusDrumWeight());
    }

    @Test
    public void testCoilNetPlusDrumWeightCalc5() {
        se.setOneCoilNetWeight(15000);
        se.setRewinderDrumWeight(1951);
        se.coilNetPlusDrumWeightCalc();
        assertArrayEquals(new int[]{16951, 9451, 6951, 5701}, se.getCoilNetPlusDrumWeight());
    }

    @Test
    public void testCoilNetPlusDrumWeightCalc6() {
        se.setOneCoilNetWeight(10000);
        se.setRewinderDrumWeight(1565);
        se.coilNetPlusDrumWeightCalc();
        assertArrayEquals(new int[]{11565, 6565, 4898, 4065}, se.getCoilNetPlusDrumWeight());
    }

    @Test
    public void testCoilWithDrumRadCalc1() {
        se.setCoilNetPlusDrumWeight(new int[]{23447, 13447, 10113, 8447});
        se.coilWithDrumRadCalc(1515);
        assertArrayEquals(new int[]{791, 599, 520, 475}, se.getCoilWithDrumRad());
    }

    @Test
    public void testCoilWithDrumRadCalc2() {
        se.setCoilNetPlusDrumWeight(new int[]{17903, 10403, 7903, 6653});
        se.coilWithDrumRadCalc(1265);
        assertArrayEquals(new int[]{757, 577, 503, 461}, se.getCoilWithDrumRad());
    }

    @Test
    public void testCoilWithDrumRadCalc3() {
        se.setCoilNetPlusDrumWeight(new int[]{12330, 7330, 5663, 4830});
        se.coilWithDrumRadCalc(1015);
        assertArrayEquals(new int[]{701, 540, 475, 439}, se.getCoilWithDrumRad());
    }

    @Test
    public void testCoilWithDrumRadCalc4() {
        se.setCoilNetPlusDrumWeight(new int[]{22336, 12336, 9002, 7336});
        se.coilWithDrumRadCalc(1515);
        assertArrayEquals(new int[]{772, 574, 490, 442}, se.getCoilWithDrumRad());
    }

    @Test
    public void testCoilWithDrumRadCalc5() {
        se.setCoilNetPlusDrumWeight(new int[]{16951, 9451, 6951, 5701});
        se.coilWithDrumRadCalc(1265);
        assertArrayEquals(new int[]{736, 550, 471, 427}, se.getCoilWithDrumRad());
    }

    @Test
    public void testCoilWithDrumRadCalc6() {
        se.setCoilNetPlusDrumWeight(new int[]{11565, 6565, 4898, 4065});
        se.coilWithDrumRadCalc(1015);
        assertArrayEquals(new int[]{679, 511, 442, 402}, se.getCoilWithDrumRad());
    }

    @Test
    public void testOuterDiameterCalc1() {
        se.setNoCoilWidth(true);
        se.setCoilWithDrumRad(new int[]{791, 599, 520, 475});
        assertArrayEquals(new int[]{0, 0, 0, 0}, se.outerDiameterCalc());
    }

    @Test
    public void testOuterDiameterCalc2() {
        se.setNoCoilWidth(false);
        se.setCoilWithDrumRad(new int[]{791, 599, 520, 475});
        assertArrayEquals(new int[]{1582, 1198, 1040, 950}, se.outerDiameterCalc());
    }

    @Test
    public void testOuterDiameterCalc3() {
        se.setNoCoilWidth(false);
        se.setCoilWithDrumRad(new int[]{757, 577, 503, 461});
        assertArrayEquals(new int[]{1514, 1154, 1006, 922}, se.outerDiameterCalc());
    }

    @Test
    public void testOuterDiameterCalc4() {
        se.setNoCoilWidth(false);
        se.setCoilWithDrumRad(new int[]{701, 540, 475, 439});
        assertArrayEquals(new int[]{1402, 1080, 950, 878}, se.outerDiameterCalc());
    }

    @Test
    public void testBodyThicknessCalc1() {
        se.setNoCoilWidth(true);
        assertArrayEquals(new int[]{0, 0, 0, 0}, 
                se.bodyThicknessCalc(new int[]{1582, 1198, 1040, 950}, 500));
    }

    @Test
    public void testBodyThicknessCalc2() {
        se.setNoCoilWidth(false);
        assertArrayEquals(new int[]{541, 349, 270, 225}, 
                se.bodyThicknessCalc(new int[]{1582, 1198, 1040, 950}, 500));
    }

    @Test
    public void testBodyThicknessCalc3() {
        se.setNoCoilWidth(false);
        assertArrayEquals(new int[]{507, 327, 253, 211}, 
                se.bodyThicknessCalc(new int[]{1514, 1154, 1006, 922}, 500));
    }

    @Test
    public void testBodyThicknessCalc4() {
        se.setNoCoilWidth(false);
        assertArrayEquals(new int[]{451, 290, 225, 189}, 
                se.bodyThicknessCalc(new int[]{1402, 1080, 950, 878}, 500));
    }

    @Test
    public void testBodyThicknessCalc5() {
        se.setNoCoilWidth(false);
        assertArrayEquals(new int[]{486, 294, 215, 170}, 
                se.bodyThicknessCalc(new int[]{1582, 1198, 1040, 950}, 610));
    }

    @Test
    public void testBodyThicknessCalc6() {
        se.setNoCoilWidth(false);
        assertArrayEquals(new int[]{452, 272, 198, 156}, 
                se.bodyThicknessCalc(new int[]{1514, 1154, 1006, 922}, 610));
    }

    @Test
    public void testBodyThicknessCalc7() {
        se.setNoCoilWidth(false);
        assertArrayEquals(new int[]{396, 235, 170, 134}, 
                se.bodyThicknessCalc(new int[]{1402, 1080, 950, 878}, 610));
    }

    @Test
    public void testDimensionSumWidthCalc1() {
        assertArrayEquals(new double[]{200, 200, 200, 200, 200}, 
                se.dimensionSumWidthCalc(new int[]{2, 2, 2, 2, 2}, new double[]{100, 100, 100, 100, 100}), 0.0001);
    }

    @Test
    public void testDimensionSumWidthCalc2() {
        assertArrayEquals(new double[]{200, 200, 200, 200, 0}, 
                se.dimensionSumWidthCalc(new int[]{2, 2, 2, 2, 2}, new double[]{100, 100, 100, 100, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWidthCalc3() {
        assertArrayEquals(new double[]{200, 200, 200, 200, 0}, 
                se.dimensionSumWidthCalc(new int[]{2, 2, 2, 2, 0}, new double[]{100, 100, 100, 100, 100}), 0.0001);
    }

    @Test
    public void testDimensionSumWidthCalc4() {
        assertArrayEquals(new double[]{577.5, 558, 0, 0, 0}, 
                se.dimensionSumWidthCalc(new int[]{15, 10, 0, 0, 0}, new double[]{38.5, 55.8, 0, 0, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWidthCalc5() {
        assertArrayEquals(new double[]{0, 577.5, 558, 0, 0}, 
                se.dimensionSumWidthCalc(new int[]{0, 15, 10, 0, 0}, new double[]{0, 38.5, 55.8, 0, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWidthCalc6() {
        assertArrayEquals(new double[]{0, 0, 577.5, 558, 0}, 
                se.dimensionSumWidthCalc(new int[]{0, 0, 15, 10, 0}, new double[]{0, 0, 38.5, 55.8, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWidthCalc7() {
        assertArrayEquals(new double[]{0, 0, 0, 577.5, 558}, 
                se.dimensionSumWidthCalc(new int[]{0, 0, 0, 15, 10}, new double[]{0, 0, 0, 38.5, 55.8}), 0.0001);
    }

    @Test
    public void testDimensionSumWidthCalc8() {
        assertArrayEquals(new double[]{558, 0, 0, 0, 577.5}, 
                se.dimensionSumWidthCalc(new int[]{10, 0, 0, 0, 15}, new double[]{55.8, 0, 0, 0, 38.5}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc1() {
        se.setOneMmBatch(0.0094);
        assertArrayEquals(new double[]{1.88, 1.88, 1.88, 1.88, 1.88}, 
                se.dimensionSumWeightCalc(new double[]{200, 200, 200, 200, 200}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc2() {
        se.setOneMmBatch(0.0094);
        assertArrayEquals(new double[]{1.88, 1.88, 1.88, 1.88, 0}, 
                se.dimensionSumWeightCalc(new double[]{200, 200, 200, 200, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc3() {
        se.setOneMmBatch(0.0094);
        assertArrayEquals(new double[]{5.4285, 5.2452, 0, 0, 0}, 
                se.dimensionSumWeightCalc(new double[]{577.5, 558, 0, 0, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc4() {
        se.setOneMmBatch(0.0094);
        assertArrayEquals(new double[]{0, 5.4285, 5.2452, 0, 0}, 
                se.dimensionSumWeightCalc(new double[]{0, 577.5, 558, 0, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc5() {
        se.setOneMmBatch(0.0094);
        assertArrayEquals(new double[]{0, 0, 5.4285, 5.2452, 0}, 
                se.dimensionSumWeightCalc(new double[]{0, 0, 577.5, 558, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc6() {
        se.setOneMmBatch(0.0094);
        assertArrayEquals(new double[]{0, 0, 0, 5.4285, 5.2452}, 
                se.dimensionSumWeightCalc(new double[]{0, 0, 0, 577.5, 558}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc7() {
        se.setOneMmBatch(0.0094);
        assertArrayEquals(new double[]{5.2452, 0, 0, 0, 5.4285}, 
                se.dimensionSumWeightCalc(new double[]{558, 0, 0, 0, 577.5}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc8() {
        se.setOneMmBatch(0);
        assertArrayEquals(new double[]{0, 0, 0, 0, 0}, 
                se.dimensionSumWeightCalc(new double[]{0, 577.5, 558, 0, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc9() {
        se.setOneMmBatch(0.0138);
        assertArrayEquals(new double[]{7.9695, 7.7004, 0, 0, 0}, 
                se.dimensionSumWeightCalc(new double[]{577.5, 558, 0, 0, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc10() {
        se.setOneMmBatch(0.0138);
        assertArrayEquals(new double[]{0, 7.9695, 7.7004, 0, 0}, 
                se.dimensionSumWeightCalc(new double[]{0, 577.5, 558, 0, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc11() {
        se.setOneMmBatch(0.0138);
        assertArrayEquals(new double[]{0, 0, 7.9695, 7.7004, 0}, 
                se.dimensionSumWeightCalc(new double[]{0, 0, 577.5, 558, 0}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc12() {
        se.setOneMmBatch(0.0138);
        assertArrayEquals(new double[]{0, 0, 0, 7.9695, 7.7004}, 
                se.dimensionSumWeightCalc(new double[]{0, 0, 0, 577.5, 558}), 0.0001);
    }

    @Test
    public void testDimensionSumWeightCalc14() {
        se.setOneMmBatch(0.0138);
        assertArrayEquals(new double[]{7.7004, 0, 0, 0, 7.9695}, 
                se.dimensionSumWeightCalc(new double[]{558, 0, 0, 0, 577.5}), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc1() {
        assertArrayEquals(new double[]{13.2013, 13.2013, 13.2013, 13.2013, 13.2013}, 
                se.dimensionSumProportionCalc(new double[]{200, 200, 200, 200, 200}, 1515), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc2() {
        assertArrayEquals(new double[]{13.2013, 13.2013, 13.2013, 13.2013, 0}, 
                se.dimensionSumProportionCalc(new double[]{200, 200, 200, 200, 0}, 1515), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc3() {
        assertArrayEquals(new double[]{38.1188, 36.8316, 0, 0, 0}, 
                se.dimensionSumProportionCalc(new double[]{577.5, 558, 0, 0, 0}, 1515), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc4() {
        assertArrayEquals(new double[]{0, 38.1188, 36.8316, 0, 0}, 
                se.dimensionSumProportionCalc(new double[]{0, 577.5, 558, 0, 0}, 1515), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc5() {
        assertArrayEquals(new double[]{0, 0, 38.1188, 36.8316, 0}, 
                se.dimensionSumProportionCalc(new double[]{0, 0, 577.5, 558, 0}, 1515), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc6() {
        assertArrayEquals(new double[]{0, 0, 0, 38.1188, 36.8316}, 
                se.dimensionSumProportionCalc(new double[]{0, 0, 0, 577.5, 558}, 1515), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc7() {
        assertArrayEquals(new double[]{36.8316, 0, 0, 0, 38.1188}, 
                se.dimensionSumProportionCalc(new double[]{558, 0, 0, 0, 577.5}, 1515), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc8() {
        assertArrayEquals(new double[]{45.6521, 44.1106, 0, 0, 0}, 
                se.dimensionSumProportionCalc(new double[]{577.5, 558, 0, 0, 0}, 1265), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc9() {
        assertArrayEquals(new double[]{0, 45.6521, 44.1106, 0, 0}, 
                se.dimensionSumProportionCalc(new double[]{0, 577.5, 558, 0, 0}, 1265), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc10() {
        assertArrayEquals(new double[]{0, 0, 45.6521, 44.1106, 0}, 
                se.dimensionSumProportionCalc(new double[]{0, 0, 577.5, 558, 0}, 1265), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc11() {
        assertArrayEquals(new double[]{0, 0, 0, 45.6521, 44.1106}, 
                se.dimensionSumProportionCalc(new double[]{0, 0, 0, 577.5, 558}, 1265), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc12() {
        assertArrayEquals(new double[]{44.1106, 0, 0, 0, 45.6521}, 
                se.dimensionSumProportionCalc(new double[]{558, 0, 0, 0, 577.5}, 1265), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc13() {
        assertArrayEquals(new double[]{56.8965, 54.9753, 0, 0, 0}, 
                se.dimensionSumProportionCalc(new double[]{577.5, 558, 0, 0, 0}, 1015), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc14() {
        assertArrayEquals(new double[]{0, 56.8965, 54.9753, 0, 0}, 
                se.dimensionSumProportionCalc(new double[]{0, 577.5, 558, 0, 0}, 1015), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc15() {
        assertArrayEquals(new double[]{0, 0, 56.8965, 54.9753, 0}, 
                se.dimensionSumProportionCalc(new double[]{0, 0, 577.5, 558, 0}, 1015), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc16() {
        assertArrayEquals(new double[]{0, 0, 0, 56.8965, 54.9753}, 
                se.dimensionSumProportionCalc(new double[]{0, 0, 0, 577.5, 558}, 1015), 0.0001);
    }

    @Test
    public void testDimensionSumProportionCalc17() {
        assertArrayEquals(new double[]{54.9753, 0, 0, 0, 56.8965}, 
                se.dimensionSumProportionCalc(new double[]{558, 0, 0, 0, 577.5}, 1015), 0.0001);
    }

    @Test
    public void testSumQtyCalc1() {
        assertEquals(10, se.sumQtyCalc(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void testSumQtyCalc2() {
        assertEquals(8, se.sumQtyCalc(new int[]{2, 2, 2, 2, 0}));
    }

    @Test
    public void testSumQtyCalc3() {
        assertEquals(5, se.sumQtyCalc(new int[]{2, 3, 0, 0, 0}));
    }

    @Test
    public void testSumQtyCalc4() {
        assertEquals(5, se.sumQtyCalc(new int[]{0, 2, 3, 0, 0}));
    }

    @Test
    public void testSumQtyCalc5() {
        assertEquals(5, se.sumQtyCalc(new int[]{0, 0, 2, 3, 0}));
    }

    @Test
    public void testSumQtyCalc6() {
        assertEquals(5, se.sumQtyCalc(new int[]{0, 0, 0, 2, 3}));
    }

    @Test
    public void testSumQtyCalc7() {
        assertEquals(5, se.sumQtyCalc(new int[]{3, 0, 0, 0, 2}));
    }

    @Test
    public void testSumSumWidthCalc1() {
        se.setNoCoilWidth(true);
        assertEquals(1001, 
                se.sumSumWidthCalc(new double[]{200.2, 200.2, 200.2, 200.2, 200.2}), 0.0001);
    }

    @Test
    public void testSumSumWidthCalc2() {
        se.setNoCoilWidth(true);
        assertEquals(800.8, 
                se.sumSumWidthCalc(new double[]{200.2, 200.2, 200.2, 200.2, 0}), 0.0001);
    }

    @Test
    public void testSumSumWidthCalc3() {
        se.setNoCoilWidth(true);
        assertEquals(1135.5, se.sumSumWidthCalc(new double[]{577.5, 558, 0, 0, 0}), 0.0001);
    }

    @Test
    public void testSumSumWidthCalc4() {
        se.setNoCoilWidth(true);
        assertEquals(1135.5, se.sumSumWidthCalc(new double[]{0, 577.5, 558, 0, 0}), 0.0001);
    }

    @Test
    public void testSumSumWidthCalc5() {
        se.setNoCoilWidth(true);
        assertEquals(1135.5, se.sumSumWidthCalc(new double[]{0, 0, 577.5, 558, 0}), 0.0001);
    }

    @Test
    public void testSumSumWidthCalc6() {
        se.setNoCoilWidth(true);
        assertEquals(1135.5, se.sumSumWidthCalc(new double[]{0, 0, 0, 577.5, 558}), 0.0001);
    }

    @Test
    public void testSumSumWidthCalc7() {
        se.setNoCoilWidth(true);
        assertEquals(1135.5, se.sumSumWidthCalc(new double[]{558, 0, 0, 0, 577.5}), 0.0001);
    }

    @Test
    public void testNoCoilWidthSetup1() {
        se.noCoilWidthSetup(1015.5, 1015);
        assertTrue(se.isNoCoilWidth());
    }

    @Test
    public void testNoCoilWidthSetup2() {
        se.noCoilWidthSetup(1265.5, 1265);
        assertTrue(se.isNoCoilWidth());
    }

    @Test
    public void testNoCoilWidthSetup3() {
        se.noCoilWidthSetup(1515.5, 1515);
        assertTrue(se.isNoCoilWidth());
    }

    @Test
    public void testNoCoilWidthSetup4() {
        se.noCoilWidthSetup(1015, 1015);
        assertFalse(se.isNoCoilWidth());
    }

    @Test
    public void testNoCoilWidthSetup5() {
        se.noCoilWidthSetup(1265, 1265);
        assertFalse(se.isNoCoilWidth());
    }

    @Test
    public void testNoCoilWidthSetup6() {
        se.noCoilWidthSetup(1515, 1515);
        assertFalse(se.isNoCoilWidth());
    }

    @Test
    public void testSumSumWeightCalc1() {
        se.setNoCoilWidth(true);
        assertEquals(0, 
                se.sumSumWeightCalc(new double[]{1.23, 1.23, 1.23, 1.23, 1.23}), 0.0001);
    }

    @Test
    public void testSumSumWeightCalc2() {
        se.setNoCoilWidth(false);
        assertEquals(6.15, 
                se.sumSumWeightCalc(new double[]{1.23, 1.23, 1.23, 1.23, 1.23}), 0.0001);
    }

    @Test
    public void testSumSumWeightCalc3() {
        se.setNoCoilWidth(false);
        assertEquals(3.69, se.sumSumWeightCalc(new double[]{1.23, 2.46, 0, 0, 0}), 0.0001);
    }

    @Test
    public void testSumSumWeightCalc4() {
        se.setNoCoilWidth(false);
        assertEquals(3.69, se.sumSumWeightCalc(new double[]{0, 1.23, 2.46, 0, 0}), 0.0001);
    }

    @Test
    public void testSumSumWeightCalc5() {
        se.setNoCoilWidth(false);
        assertEquals(3.69, se.sumSumWeightCalc(new double[]{0, 0, 1.23, 2.46, 0}), 0.0001);
    }

    @Test
    public void testSumSumWeightCalc6() {
        se.setNoCoilWidth(false);
        assertEquals(3.69, se.sumSumWeightCalc(new double[]{0, 0, 0, 1.23, 2.46}), 0.0001);
    }

    @Test
    public void testSumSumWeightCalc7() {
        se.setNoCoilWidth(false);
        assertEquals(3.69, se.sumSumWeightCalc(new double[]{2.46, 0, 0, 0, 1.23}), 0.0001);
    }

    @Test
    public void testSumSumPortionCalc1() {
        se.setNoCoilWidth(true);
        assertEquals(0, se.sumSumProportionCalc(new double[]{15, 15, 15, 15, 15}), 0.0001);
    }

    @Test
    public void testSumSumPortionCalc2() {
        se.setNoCoilWidth(false);
        assertEquals(75, se.sumSumProportionCalc(new double[]{15, 15, 15, 15, 15}), 0.0001);
    }

    @Test
    public void testSumSumPortionCalc3() {
        se.setNoCoilWidth(false);
        assertEquals(46.2, se.sumSumProportionCalc(new double[]{15.4, 30.8, 0, 0, 0}), 0.0001);
    }

    @Test
    public void testSumSumPortionCalc4() {
        se.setNoCoilWidth(false);
        assertEquals(46.2, se.sumSumProportionCalc(new double[]{0, 15.4, 30.8, 0, 0}), 0.0001);
    }

    @Test
    public void testSumSumPortionCalc5() {
        se.setNoCoilWidth(false);
        assertEquals(46.2, se.sumSumProportionCalc(new double[]{0, 0, 15.4, 30.8, 0}), 0.0001);
    }

    @Test
    public void testSumSumPortionCalc6() {
        se.setNoCoilWidth(false);
        assertEquals(46.2, se.sumSumProportionCalc(new double[]{0, 0, 0, 15.4, 30.8}), 0.0001);
    }

    @Test
    public void testSumSumPortionCalc7() {
        se.setNoCoilWidth(false);
        assertEquals(46.2, se.sumSumProportionCalc(new double[]{30.8, 0, 0, 0, 15.4}), 0.0001);
    }

    @Test
    public void testWasteEdgeWidthCalc1() {
        assertEquals(0, se.wasteEdgeWidthCalc(1515, 1516), 0.0001);
    }

    @Test
    public void testWasteEdgeWidthCalc2() {
        assertEquals(0, se.wasteEdgeWidthCalc(1515, 1515), 0.0001);
    }

    @Test
    public void testWasteEdgeWidthCalc3() {
        assertEquals(7.5, se.wasteEdgeWidthCalc(1515, 1500), 0.0001);
    }

    @Test
    public void testWasteEdgeWidthCalc4() {
        assertEquals(7.5, se.wasteEdgeWidthCalc(1265, 1250), 0.0001);
    }

    @Test
    public void testWasteEdgeWidthCalc5() {
        assertEquals(7.5, se.wasteEdgeWidthCalc(1015, 1000), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc1() {
        assertEquals(0, se.remainsFromWidthCalc(1515, 1515, 5), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc2() {
        assertEquals(19.5, se.remainsFromWidthCalc(1515, 1485.5, 5), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc3() {
        assertEquals(9.5, se.remainsFromWidthCalc(1515, 1485.5, 10), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc4() {
        assertEquals(0, se.remainsFromWidthCalc(1515, 1485.5, 15), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc5() {
        assertEquals(19.5, se.remainsFromWidthCalc(1265, 1235.5, 5), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc6() {
        assertEquals(9.5, se.remainsFromWidthCalc(1265, 1235.5, 10), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc7() {
        assertEquals(0, se.remainsFromWidthCalc(1265, 1235.5, 15), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc8() {
        assertEquals(19.5, se.remainsFromWidthCalc(1015, 985.5, 5), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc9() {
        assertEquals(9.5, se.remainsFromWidthCalc(1015, 985.5, 10), 0.0001);
    }

    @Test
    public void testRemainsFromWidthCalc10() {
        assertEquals(0, se.remainsFromWidthCalc(1015, 985.5, 15), 0.0001);
    }

    @Test
    public void testSumWasteCalc1() {
        se.setNoCoilWidth(true);
        assertEquals(0, se.sumWasteCalc(100, 97.5), 0.0001);
    }

    @Test
    public void testSumWasteCalc2() {
        se.setNoCoilWidth(false);
        assertEquals(2.5, se.sumWasteCalc(100, 97.5), 0.0001);
    }

    @Test
    public void testSumWasteCalc3() {
        se.setNoCoilWidth(false);
        assertEquals(2.5, se.sumWasteCalc(30, 27.5), 0.0001);
    }

    @Test
    public void testSumWasteCalc4() {
        se.setNoCoilWidth(false);
        assertEquals(2.5, se.sumWasteCalc(20, 17.5), 0.0001);
    }

    @Test
    public void testSumWasteCalc5() {
        se.setNoCoilWidth(false);
        assertEquals(2.5, se.sumWasteCalc(10, 7.5), 0.0001);
    }

    @Test
    public void testSumWasteCalc6() {
        se.setNoCoilWidth(false);
        assertEquals(2.5, se.sumWasteCalc(30.5, 28), 0.0001);
    }

    @Test
    public void testSumWasteCalc7() {
        se.setNoCoilWidth(false);
        assertEquals(2.5, se.sumWasteCalc(20.5, 18), 0.0001);
    }

    @Test
    public void testSumWasteCalc8() {
        se.setNoCoilWidth(false);
        assertEquals(2.5, se.sumWasteCalc(10.5, 8), 0.0001);
    }

    @Test
    public void testDimensionPickCalc1() {
        se.setNoCoilWidth(true);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, 
            {0, 0, 0, 0}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{1, 1, 1, 1, 1}, new double[]{200, 200, 200, 200, 200}));
    }

    @Test
    public void testDimensionPickCalc2() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{2.64, 1.32, 0.88, 0.66}, {2.64, 1.32, 0.88, 0.66}, 
            {2.64, 1.32, 0.88, 0.66}, {2.64, 1.32, 0.88, 0.66}, {2.64, 1.32, 0.88, 0.66}}, 
                se.dimensionPickCalc(new int[]{1, 1, 1, 1, 1}, new double[]{200, 200, 200, 200, 200}));
    }

    @Test
    public void testDimensionPickCalc3() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{2.64, 1.32, 0.88, 0.66}, {2.64, 1.32, 0.88, 0.66}, 
            {2.64, 1.32, 0.88, 0.66}, {2.64, 1.32, 0.88, 0.66}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{1, 1, 1, 1, 0}, new double[]{200, 200, 200, 200, 200}));
    }

    @Test
    public void testDimensionPickCalc4() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{0.5082, 0.2541, 0.1694, 0.1271}, 
            {0.7366, 0.3683, 0.2455, 0.1841}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{15, 10, 0, 0, 0}, new double[]{38.5, 55.8, 0, 0, 0}));
    }

    @Test
    public void testDimensionPickCalc5() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0.5082, 0.2541, 0.1694, 0.1271}, 
            {0.7366, 0.3683, 0.2455, 0.1841}, {0, 0, 0, 0}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{0, 15, 10, 0, 0}, new double[]{0, 38.5, 55.8, 0, 0}));
    }

    @Test
    public void testDimensionPickCalc6() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0.5082, 0.2541, 0.1694, 0.1271}, 
            {0.7366, 0.3683, 0.2455, 0.1841}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{0, 0, 15, 10, 0}, new double[]{0, 0, 38.5, 55.8, 0}));
    }

    @Test
    public void testDimensionPickCalc7() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, 
            {0.5082, 0.2541, 0.1694, 0.1271}, {0.7366, 0.3683, 0.2455, 0.1841}}, 
                se.dimensionPickCalc(new int[]{0, 0, 0, 15, 10}, new double[]{0, 0, 0, 38.5, 55.8}));
    }

    @Test
    public void testDimensionPickCalc8() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0132);
        assertArrayEquals(new double[][]{{0.7366, 0.3683, 0.2455, 0.1841}, {0, 0, 0, 0}, 
            {0, 0, 0, 0}, {0, 0, 0, 0}, {0.5082, 0.2541, 0.1694, 0.1271}},
                se.dimensionPickCalc(new int[]{10, 0, 0, 0, 15}, new double[]{55.8, 0, 0, 0, 38.5}));
    }

    @Test
    public void testDimensionPickCalc9() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0158);
        assertArrayEquals(new double[][]{{0.6083, 0.3042, 0.2028, 0.1521}, 
            {0.8816, 0.4408, 0.2939, 0.2204}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{15, 10, 0, 0, 0}, new double[]{38.5, 55.8, 0, 0, 0}));
    }

    @Test
    public void testDimensionPickCalc10() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0158);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0.6083, 0.3042, 0.2028, 0.1521}, 
            {0.8816, 0.4408, 0.2939, 0.2204}, {0, 0, 0, 0}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{0, 15, 10, 0, 0}, new double[]{0, 38.5, 55.8, 0, 0}));
    }

    @Test
    public void testDimensionPickCalc11() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0158);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0.6083, 0.3042, 0.2028, 0.1521}, 
            {0.8816, 0.4408, 0.2939, 0.2204}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{0, 0, 15, 10, 0}, new double[]{0, 0, 38.5, 55.8, 0}));
    }

    @Test
    public void testDimensionPickCalc12() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0158);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, 
            {0.6083, 0.3042, 0.2028, 0.1521}, {0.8816, 0.4408, 0.2939, 0.2204}}, 
                se.dimensionPickCalc(new int[]{0, 0, 0, 15, 10}, new double[]{0, 0, 0, 38.5, 55.8}));
    }

    @Test
    public void testDimensionPickCalc13() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0158);
        assertArrayEquals(new double[][]{{0.8816, 0.4408, 0.2939, 0.2204}, {0, 0, 0, 0}, 
            {0, 0, 0, 0}, {0, 0, 0, 0}, {0.6083, 0.3042, 0.2028, 0.1521}},
                se.dimensionPickCalc(new int[]{10, 0, 0, 0, 15}, new double[]{55.8, 0, 0, 0, 38.5}));
    }

    @Test
    public void testDimensionPickCalc14() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0196);
        assertArrayEquals(new double[][]{{0.7546, 0.3773, 0.2515, 0.1886}, 
            {1.0937, 0.5468, 0.3646, 0.2734}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{15, 10, 0, 0, 0}, new double[]{38.5, 55.8, 0, 0, 0}));
    }

    @Test
    public void testDimensionPickCalc15() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0196);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0.7546, 0.3773, 0.2515, 0.1886}, 
            {1.0937, 0.5468, 0.3646, 0.2734}, {0, 0, 0, 0}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{0, 15, 10, 0, 0}, new double[]{0, 38.5, 55.8, 0, 0}));
    }

    @Test
    public void testDimensionPickCalc16() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0196);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0.7546, 0.3773, 0.2515, 0.1886}, 
            {1.0937, 0.5468, 0.3646, 0.2734}, {0, 0, 0, 0}}, 
                se.dimensionPickCalc(new int[]{0, 0, 15, 10, 0}, new double[]{0, 0, 38.5, 55.8, 0}));
    }

    @Test
    public void testDimensionPickCalc17() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0196);
        assertArrayEquals(new double[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, 
            {0.7546, 0.3773, 0.2515, 0.1886}, {1.0937, 0.5468, 0.3646, 0.2734}}, 
                se.dimensionPickCalc(new int[]{0, 0, 0, 15, 10}, new double[]{0, 0, 0, 38.5, 55.8}));
    }

    @Test
    public void testDimensionPickCalc18() {
        se.setNoCoilWidth(false);
        se.setOneMmCoil(0.0196);
        assertArrayEquals(new double[][]{ {1.0937, 0.5468, 0.3646, 0.2734}, {0, 0, 0, 0}, 
            {0, 0, 0, 0}, {0, 0, 0, 0}, {0.7546, 0.3773, 0.2515, 0.1886}},
                se.dimensionPickCalc(new int[]{10, 0, 0, 0, 15}, new double[]{55.8, 0, 0, 0, 38.5}));
    }

    @Test
    public void testDimensionResultDisplay1() {
        assertEquals("1 * 50.0mm + 1 * 100.0mm + 1 * 150.0mm + 1 * 200.0mm + 1 * 250.0mm", 
                se.dimensionResultDisplay(new int[]{1, 1, 1, 1, 1}, 
                        new double[]{50, 100, 150, 200, 250}));
    }

    @Test
    public void testDimensionResultDisplay2() {
        assertEquals("1 * 50.0mm + 1 * 100.0mm + 1 * 150.0mm + 1 * 200.0mm", 
                se.dimensionResultDisplay(new int[]{1, 1, 1, 1, 0}, 
                        new double[]{50, 100, 150, 200, 250}));
    }

    @Test
    public void testDimensionResultDisplay3() {
        assertEquals("15 * 38.5mm + 10 * 55.8mm", 
                se.dimensionResultDisplay(new int[]{15, 10, 0, 0, 0}, 
                        new double[]{38.5, 55.8, 0, 0, 0}));
    }

    @Test
    public void testDimensionResultDisplay4() {
        assertEquals("15 * 38.5mm + 10 * 55.8mm", 
                se.dimensionResultDisplay(new int[]{0, 15, 10, 0, 0}, 
                        new double[]{0, 38.5, 55.8, 0, 0}));
    }

    @Test
    public void testDimensionResultDisplay5() {
        assertEquals("15 * 38.5mm + 10 * 55.8mm", 
                se.dimensionResultDisplay(new int[]{0, 0, 15, 10, 0}, 
                        new double[]{0, 0, 38.5, 55.8, 0}));
    }

    @Test
    public void testDimensionResultDisplay6() {
        assertEquals("15 * 38.5mm + 10 * 55.8mm", 
                se.dimensionResultDisplay(new int[]{0, 0, 0, 15, 10}, 
                        new double[]{0, 0, 0, 38.5, 55.8}));
    }
}
