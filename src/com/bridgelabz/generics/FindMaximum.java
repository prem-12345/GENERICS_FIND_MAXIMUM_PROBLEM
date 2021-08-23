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

    /**
     * UC2 Given three flot value find the maximum
     *
     * @author prem
     * @version 11.2
     * @since 23/08/2021
     */

    public Float getMax(Float firstValue, Float secondValue, Float thirdValue) {
        Float max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }

    public static void main(String[] args) {

        FindMaximum maximum = new FindMaximum();
        System.out.println("Maximum Value:");
        System.out.println(maximum.getMax(12.3f, 15.8f, 85.3f));

    }


}
