package com.lession4;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	

	static int seq(int arr[], int len){
	      int seq_arr[] = new int[len];
	      int i, j, max = 0;
	      for (i = 0; i < len; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < len; i++)
	      for (j = 0; j < i; j++)
	      if (arr[i] >arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }
	   public static void main(String args[]){
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size of array");
		   int size=sc.nextInt();
		   int arr[]=new int[size];
		   System.out.println("Enter the elements");
		   for(int n=0;n<size;n++) {
			   arr[n]=sc.nextInt();
		   }
	      
	      int len = arr.length;
	      System.out.println("Length of longest increasing subsequence is:-" +seq(arr,len));
	   }	
	
	
}
