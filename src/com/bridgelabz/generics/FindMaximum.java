package com.bridgelabz.generics;

/**
 * Welcome to find maximum problem using Generics
 *
 * @author prem
 * @version 11.0
 * @since 23/08/2021
 */


public class FindMaximum {

    /**
     * UC1 Given three integrs find the maximum
     *
     * @author prem
     * @version 11.1
     * @since 23/08/2021
     */

    public Integer getMax(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }

    public static void main(String[] args) {

        FindMaximum maximum = new FindMaximum();
        System.out.println("Maximum Value:");
        System.out.println(maximum.getMax(60, 50, 55));

    }


}
