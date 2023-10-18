package ru.gb.hw2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0");
        System.out.println("countEvens([2, 1, 2, 3, 4])->"+countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println("countEvens([2, 2, 0])->"+countEvens(new int[]{2, 2, 0}));
        System.out.println("countEvens([1, 3, 5])->"+countEvens(new int[]{1, 3, 5}));
        System.out.println("----------------");

        System.out.println("2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.");
        System.out.println("diffMaxMinElementArray([2, -1, 2, 3, 4])->"+diffMaxMinElementArray(new int[]{2, -1, 2, 3, 4}));
        System.out.println("diffMaxMinElementArray([])->"+diffMaxMinElementArray(new int[]{}));
        System.out.println("----------------");

        System.out.println("3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с заданным значением");
        System.out.println("checkTwoValueOrderElementsArray([2, 1, 2, 3, 4],0)->"+checkTwoValueOrderElementsArray(new int[]{2, 1, 2, 3, 4},2));
        System.out.println("checkTwoValueOrderElementsArray([2, 1, 0, 0, 4],0)->"+checkTwoValueOrderElementsArray(new int[]{2, 1, 0, 0, 4},0));
        System.out.println("checkTwoValueOrderElementsArray([2, 1, 0, 3, 3],3)->"+checkTwoValueOrderElementsArray(new int[]{2, 1, 0, 3, 3},3));

    }

    private static int countEvens(int[] array){
        int count = 0;
        for (int value : array
        ) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int diffMaxMinElementArray(int[] array){

        if(array.length>0){
            int minValue = array[0];
            int maxValue = array[0];

            for (int i = 1; i <array.length ; i++) {
                if(array[i] < minValue){
                    minValue=array[i];
                } else if (array[i] > maxValue) {
                    maxValue =array[i];
                }
            }
            return maxValue-minValue;
        } else {
            System.out.println("Массив не может быть пустым");
            return -1;
        }
    }

    private static boolean checkTwoValueOrderElementsArray(int[] array,int value){
        boolean result = false;
        if(array.length <= 1){
            return result;
        }
        else{
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]==value && array[i+1]==value){
                    result = true;
                }
            }
            return result;
        }
    }



}