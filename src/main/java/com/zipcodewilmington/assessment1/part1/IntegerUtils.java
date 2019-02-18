package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
       int getSumOfN = 0;
      for(int i =0; i <= n; i++) {
          getSumOfN += i;
      }

        return getSumOfN;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int getProductOfN = 1;
        for(int i = 1; i <= n; i++) {
            getProductOfN *= i;
        }
        return getProductOfN;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int reverseDigits = 0;
      while(val != 0 ) {

          int digit = val % 10;
          reverseDigits = reverseDigits * 10 + digit;
          val /= 10;
      }

        return reverseDigits;
    }
}
