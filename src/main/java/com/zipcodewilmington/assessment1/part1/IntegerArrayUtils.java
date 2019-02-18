package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int getSum = 0;
        int i;
        for(i=0; i<intArray.length; i++) {
            getSum += intArray[i];
        }


        return getSum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int getProduct = 1;
        int i;
        for(i=0; i<intArray.length; i++) {
            getProduct *= intArray[i];
        }


        return getProduct;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int getSum = 0;
        int i;
        for(i=0; i<intArray.length; i++) {
            getSum += intArray[i];
        }

        double getAverage = getSum / intArray.length;

        return getAverage;


    }
}
