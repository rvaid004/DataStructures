/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.ds;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @PID 5918963
 */
public class SortMethods {
    private int length ;   
    private int[] list ;      //the arrray of integers
    private int elements ;    //elements inside the array
    private int size ;        //size of the array
    
    /**
     * Constructor 
     */
    public SortMethods() {
        list = new int[elements];
    }
    /**
     * Constructor
     * @param size 
     */
    public SortMethods(int size) {
        this.size = size;
        list = new int[size];
    }
    /**
     * Prints all the elements of the array
     */
    public void print(){
        System.out.println(Arrays.toString(list)) ; 
    }
    /**
     * Fills the array with random integers
     */
      public void populate()
    {
        Random rand = new Random() ; 
        for (int i = 0; i < list.length; i++){
            list[i] = rand.nextInt(10000) ; 
        }
    }
    /**
     * Indirect recursive method. Calls the private recursive method
     */
     public void quicksort()
    {
        quicksort(0, size - 1);
    }
    /**
     * Sorts the array recursively using the quick sort algorithm
     * @param begin
     * @param end 
     */
    private void quicksort(int begin, int end)
    {
        int temp;
        int pivot = findPivotLocation(begin, end);

        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;

        pivot = end;

        int i = begin,
                j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted)
        {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;

            if (i < j)
            {
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            } else
                iterationCompleted = true;
        }

        //swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1) quicksort(begin, i - 1);
        if (i + 1 < end) quicksort(i + 1, end);
    }

    /*
     * Computes the pivot
     */
    private int findPivotLocation(int b, int e)
    {
        return (b + e) / 2;
    }
    /**
     * Sorts the array using the bubble sort algorithm
     */
    public void bubblesort(){
        for(int i =0; i<list.length-1; i++){
            for(int j = 0; j<list.length-i-1 ; j++){
            if(list[j]>list[j+1])
            {
                int temp = list[j] ; 
                list[j] = list[j+1] ; 
                list[j+1] = temp ; 
            }
        }
        }
    }
    /**
     * Sorts the array using the selection sort algorithm
     */
     public void selectionSort(){
         
        for (int i = 0; i < list.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < list.length; j++)
                if (list[j] < list[index]) 
                    index = j;
      
            int smallerNumber = list[index];  
            list[index] = list[i];
            list[i] = smallerNumber;
        }
       
    }
     
}
