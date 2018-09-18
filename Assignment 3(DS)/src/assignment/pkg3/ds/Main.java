/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.ds;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author rishabh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String outputFilename = "output.csv";

        PrintWriter output = null;
        //open output stream
        try {
            output = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException ex) {
            System.exit(1);
        }

        Random rnd = new Random();
        int n = 301;
        for (int i = 1; i < n; i++) {
            SortMethods a = new SortMethods(i);
            a.populate() ; 
            
            long startTime = System.nanoTime();
            a.bubblesort();
            long endTime = System.nanoTime();
            
             long start = System.nanoTime();
            a.selectionSort();
            long end = System.nanoTime();
            
             long st = System.nanoTime();
            a.quicksort();
            long en = System.nanoTime();
            
            output.println((endTime - startTime) + ", "+ (end-start)+ ", "
            + (en-st));
        }
        //close output stream
        output.close();
    }

}
