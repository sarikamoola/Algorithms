package com.practice.algos;
 
public class InsertionSort {
 
    public static void main(String a[]){
        int[] arr1 = {5,2,4,6,1,3};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
       public static int[] doInsertionSort(int[] input){
         
         for (int j = 1; j < input.length; j++) {
        	//int key = 0;
        	int key=input[j];
        	int i=j-1;
        	while(i>-1 && input[i]>key){
        		input[i+1]=input[i];
        		i=i-1;
        		input[i+1]=key;
        	}
        }
        return input;
    }
}