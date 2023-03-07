package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String s:array){
            if(s.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] arr = new String[array.length];
        for(int i = 0; i<arr.length; i++){
            arr[i] = array[array.length - i -1];
        }

        return arr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean flag;
        for (int i = 97; i <= 122; i++){
            flag = false;
            for (String s : array) {
                if(s.toLowerCase().contains(String.valueOf((char) i))){
                    flag = true;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(String s: array){
            if(s.equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arr = new ArrayList<>(List.of(array));
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i).equals(valueToRemove)){
                arr.remove(i);
                i--;
            }
        }
        return arr.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<>(List.of(array));
        String current;
        for(int i = 1; i<arr.size(); i++){
            current = arr.get(i);
            if(arr.get(i-1).equals(current)){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
        return arr.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<>(List.of(array));
        String current;
        for(int i = 1; i<arr.size(); i++){
            current = String.valueOf(arr.get(i).charAt(0));
            if(String.valueOf(arr.get(i-1).charAt(0)).equals(current)){
                arr.set(i-1, arr.get(i-1)+current);
                arr.remove(i);
                i--;
            }
        }
        return arr.toArray(new String[0]);
    }


}
