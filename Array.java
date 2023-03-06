// Java Program to Print the Elements of an Array using for loop
public class GFG {
	public static void main(String[] args)
	{
		int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };
		System.out.print("Elements of given array are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
//Adding elements to array by creating large array
import java.util.Arrays;  
public class ArrayExample {  
  public static void main(String[] args) {    
    int arr[] = {1,2,3,4,5,6};  
    int n = arr.length;  
    int newArr[] = new int[n+1];  
    int value = 7;  
    System.out.println(Arrays.toString(arr));  
    for(int i = 0; i<n; i++) {  
      newArr[i] = arr[i];  
    }  
    newArr[n] = value;  
    System.out.println(Arrays.toString(newArr));  
  }  
}
//Removing an element from Array using for loop
package com.java;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
    }
}
//Searching array elements using binary search
import java.util.*;
public class Gfg {
    public static void main(String args[]) throws Exception
    {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = Arrays.binarySearch(array, 2);
        if (index >= 0)
            System.out.println("Element 2 found at index: "
                               + index);
        else
            System.out.println("Element not found");
    }
}
//gettin array element at given index using get() method
import java.lang.reflect.Array;
public class GfG {
	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			int x = (int)Array.get(a, i);
			System.out.print(x + " ");
		}
	}
}
// Java code to demonstrate set() method of Array class
import java.lang.reflect.Array;
public class GfG {
	public static void main(String[] args)
	{
		String s[] = { "Geeks", "is", "Geeks" };
		System.out.print("Before Set : ");
		for (String x : s) {
			System.out.print(x);
		}
		Array.set(s, 1, "for");
		System.out.print("\nAfter Set : ");
		for (String x : s) {
			System.out.print(x);
		}
	}
}
//Finding maximum and minimum element in an array
import java.io.*;
class GFG {
    static int getMin(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }
  
    static int getMax(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }
  
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = arr.length;
        System.out.println("Minimum element of array: " + getMin(arr, n));
        System.out.println("Maximum element of array: " + getMax(arr, n));
    }
}
// Basic Java program that reverses an array
public class reverseArray {
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}
// Java program to Left Rotate an Array
class GFG {
    void leftRotate(int arr[], int d, int n)
    {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        // Creating an object of class inside main()
        GFG rotate = new GFG();
 
        // Custom input array
        int arr[] = { 1, 2, 3, 4, 5 };
 
        // Calling method 1 and 2 as defined above
        rotate.leftRotate(arr, 2, arr.length);
        rotate.printArray(arr, arr.length);
    }
}
