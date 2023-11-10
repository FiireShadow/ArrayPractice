package _DataStructurePractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DataStructuresPractice {

	public static int lengthOfInt(int n) { //Helper method
		int length =0;
		while (n>0) {
			n/=10;
			length++;
		}
		return length;
	}
	
	
	
	public static boolean isPalindrome(int n) {
		int[] arr = new int[lengthOfInt(n)];
		int[] revArr = new int[lengthOfInt(n)];
		
		int temp = n;
		for (int i=0; i<arr.length; i++) {
			arr[i] = temp%10;
			temp/=10;
		}
		int revArrCounter = 0;
		for (int i=arr.length-1;i>=0;i--) {
			revArr[revArrCounter] = arr[i];
			revArrCounter++;
		}
		
		String arrString = Arrays.toString(arr);
		String revArrString = Arrays.toString(revArr);
		
		return arrString.equals(revArrString);
	}
	
	
	
	public static double averageOfArrayForLoop(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return (double) sum/arr.length;
	}
	
	public static double averageOfArrayStream(int[] arr) {
		double average = Arrays.stream(arr)
				.average()
				.orElse(0.0);
		return average;
	}
	
	
	public static void sortedIntArray(int[] arr) {
		int[] sortedArray = arr.clone();
		Arrays.sort(sortedArray);
		
		for (int i : sortedArray)
			System.out.print(i + " ");
	}
	
	
	public static void sortedStringArray(String[] arr) {
		String[] sortedArray = arr.clone();
		Arrays.sort(sortedArray);
		
		for (String i : sortedArray)
			System.out.print(i + " ");
	}
	
	public static void print2D_Hyphens() {
		for (int i=0; i<10;i++) {
			for (int j=0; j<10; j++) {
				System.out.print("-" + " ");
			}
		System.out.println("-" + " ");
		}
	}
	
	public static void maxAndMin(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max<arr[i])
				max=arr[i];
			if (min>arr[i])
				min=arr[i];
		}
		System.out.println("Max is " + max + " and min is " + min + ".");
	}
	
	public static void findIntDuplicates(int[] arr) {
		for (int i=0; i<arr.length;i++) {
			for (int j=i+1; j<arr.length;j++) {
				if (arr[i]==arr[j] && i!=j)
					System.out.println("Duplicate element: " + arr[j]);
			}
		}
	}
		
	public static void findStringDuplicates(String[] arr) {
		for (int i=0; i<arr.length;i++) {
			for (int j=i+1; j<arr.length;j++) {
				if (arr[i]==arr[j] && i!=j)
					System.out.println("Duplicate element: " + arr[j]);
			}
		}
	}

	
	public static void print2ndLargestNumber(int[] arr) {
		int max = 0;
		int max2= 0;
		 for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == max) {
	            	max2 = max;
	            } 
	            else if (arr[i] > max) {
	            	max2 = max;
	                max = arr[i];
	            } 
	            else if (arr[i] > max2) {
	            	max2 = arr[i];
	            }
	        }
		 System.out.println(max2);
	}
	
	public static void add2Matricies(int[][] a, int[][] b) {
		int c= a.length;
		int r= a[0].length;
		int[][] arr1= new int[c][r];
		int[][] arr2= new int[c][r];
		int[][] sum = new int[c][r];
		
		for (int i=0; i<c; i++) {
			for (int j=0; j<r;j++) {
				arr1[i][j] =(int)(Math.random()*16);
			}
		}
		for (int i=0; i<c; i++) {
			for (int j=0; j<r;j++) {
				arr2[i][j] =(int)(Math.random()*16);
			}
		}
		
		 for (int i=0; i<c; i++) {
	            for (int j=0; j<r; j++) {
	                sum[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }
		 for (int i = 0; i < c; i++) {
		        for (int j = 0; j < r; j++) {
		            System.out.print(sum[i][j] + " ");
		        }
		        System.out.println();
		 }
	}
	
	public static void printMajorityElement(int[] a) {
		int currentCounter =1;
		int oldCounter=1;
		int majority =a[0];
		for (int i=0; i<a.length;i++) {
			if (a[i] == majority) { // If the current element is the same as the majority element
	            currentCounter++; // Increment the counter
	        } 
			else {
				oldCounter = currentCounter;
	            if (currentCounter <= oldCounter) { // Check if the current counter is less than or equal to the old counter
	               // majority = a[i]; // Update the majority element
	                oldCounter = currentCounter; // Update the old counter
	            }
	            currentCounter = 1; // Reset the counter for the new element
	        }
		}
		
		if (currentCounter>a.length/2)
			System.out.println(majority);
		else {
			System.out.println("No majority");
		}
	}
	
	
	
	public static void main(String[] args) {
		int num1 = 1234321;
		int num2 = 11222333;
		
		int[] numArr1 = {1,3,4,5,4,5,2,1};
		int[] numArr2 = {1,4,9,15,27,86,112};
		int[] numArr3 = {2,2,2,2,2,2,2,2,3,3};
		
		int[][] Arr1_2D = {{1,3},{4,5}};
		int[][] Arr2_2D = {{1,3},{4,5}};
		
		String[] StrArr1 = {"Hello", "Nope", "Sort", "OKay", "Please"};
		String[] StrArr2 = {"Pick", "Nope", "Sort", "Please", "Okay"};
//		System.out.println(isPalindrome(num1));
//		System.out.println(isPalindrome(num2));
//		System.out.println(averageOfArrayForLoop(numArr1));
//		System.out.println(averageOfArrayStream(numArr1));
//		sortedStringArray(StrArr1);
//		print2D_Hyphens();
//		maxAndMin(numArr1);
//		findStringDuplicates(StrArr1);
//		print2ndLargestNumber(numArr2);
//		add2Matricies(Arr1_2D, Arr2_2D);
		printMajorityElement(numArr3);
		

	}

}
