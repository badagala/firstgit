package com.gss.coding;

public class NonRepeatedCharactersInaWord {
	
	public static void main(String[] args) {
		
		String value="Javatpoint";
		boolean flag=true;
		
		for(char c:value.toCharArray()) {
			if(value.indexOf(c)== value.lastIndexOf(c)) {
				System.out.println("the first character that which is not repeating is :"+c);
                flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("There is no nonrepeating letter");
		}
	}

}
