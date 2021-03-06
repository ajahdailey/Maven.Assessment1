package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for(Object enter : objectArray) {
            if(objectToCount.equals(enter) ){
                counter++;
            }

        }


        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer enter : objectArray) {
           if(enter != (objectToRemove))
            myList.add(enter);
        }

        objectArray = myList.toArray(new Integer[myList.size()]);


        return objectArray;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
    Integer[] counter = new Integer[objectArray.length];
         for(int i = 0; i < objectArray.length; i++) {
        counter[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
    }
       Integer Index =  0;
         for(int a =0; a < counter.length - 1; a++) {
             if(counter[Index] > counter[a]) {
                 Index = a;
             }else {
                 Index = a+1;
             }

         }

    return objectArray[Index];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        Integer[] counter = new Integer[objectArray.length];
        for(int i = 0; i < objectArray.length; i++) {
            counter[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
        }
        Integer Index =  0;
        for(int a =0; a < counter.length - 1; a++) {
            if(counter[Index] > counter[a]) {
                Index = a;
            }

        }

        return objectArray[Index];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        Integer[] mergedArray = new Integer[objectArray.length + objectArrayToAdd.length];

         int counter = 0;
         for(int i=0; i <objectArray.length; i++) {
            mergedArray[counter] = objectArray[i];
             counter++;
         }
        for(int i = 0; i < objectArrayToAdd.length; i++) {
            mergedArray[counter] = objectArrayToAdd[i];
            counter++;
        }
        return mergedArray;
    }
}
