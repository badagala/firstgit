package com.gss.base;

import java.util.Arrays;

public class MergeArrays {
	
	public static void main(String[] args) {
		int[] array1={1,2,3,4,5,6};
		int[] array2= {2,5,56,8,5};
		int[] mergeArray=new int[array1.length + array2.length];
		System.arraycopy(array1, 0, mergeArray, 0, array1.length);
		System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);
		System.out.println(Arrays.toString(mergeArray));
	}

}
