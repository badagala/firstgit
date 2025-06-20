package com.gss.coding;
import java.util.Arrays;

public class RemovingDuplicateInString {
	public static void main(String[] args) {
		String str="Removing Duplicate characters in a String ";
		str=str.toLowerCase();
		char[] value=str.toCharArray();
		removeDuplicates(value);
	}

	private static void removeDuplicates(char[] value) {	
		int index=0;
		for(int i=0;i<value.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(value[i]==value[j])
					break;
			}
			if(j==i) {
				value[index++]=value[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(value, index)));	
	}
}
