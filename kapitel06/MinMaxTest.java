package kapitel06;

import kapitel06.MinMax.MinMaxValues;

/**
 * MinMaxTest
 */
public class MinMaxTest {

    public static void main(String[] args) {
        
        MinMaxValues minmax = MinMax.minMax(1, 2,3,4,5);
        
        System.out.println(minmax.min());
        System.out.println(minmax.max());
    }
}