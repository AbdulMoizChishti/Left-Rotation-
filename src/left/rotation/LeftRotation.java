/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package left.rotation;

import java.util.Arrays;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class LeftRotation {

    /**
     * @param args the command line arguments
     */
    public static void leftRotateByOne(int[] arr)
    {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
 
        arr[arr.length - 1] = first;
    }
 
    // Function to left-rotate an array by `r` positions
    public static void leftRotate(int[] arr, int r)
    {
        // base case: invalid input
        if (r < 0 || r >= arr.length) {
            return;
        }
 
        for (int i = 0; i < r; i++) {
            leftRotateByOne(arr);
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        int r = 7;
 
        leftRotate(arr, r);
 
        System.out.println(Arrays.toString(arr));
        
    }
}
