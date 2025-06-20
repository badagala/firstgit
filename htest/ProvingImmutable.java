package com.gss.htest;

public class ProvingImmutable {
	
	public static void main(String[] args) {
		//Proving that StringBuffer is mutable
		StringBuffer input=new StringBuffer("Hello");
		input.append("World");
		System.out.println(input.toString());
		
		//Proving String is Immutable
		String value="Hello";
		value.concat("World");
		System.out.println(value);
		
		/*Immutable class in java
		 * 
		 * An immutable class in Java is designed in such a way that its state cannot be
		 * changed after the object is created. By following the guidelines above, such
		 * as making the class final, using final fields, and not providing setter
		 * methods, you can create a class that is safe to share and use in
		 * multi-threaded environments.
		 */
		
		/*Serialization In java
		 * 
		 * Serialization in Java allows objects to be converted to a byte stream for
		 * storage or transmission, and then restored back to their original form. It is
		 * widely used in scenarios like saving application state, transmitting objects
		 * over a network, or persisting data. However, it requires careful handling of
		 * issues like versioning (using serialVersionUID) and the use of the transient
		 * keyword for excluding sensitive fields from serialization.
		 */
		
		/*
		 * Transient Keyword
		 * 
		 * 
		 * Sometimes, you may not want certain fields to be serialized (e.g., sensitive
		 * data or temporary variables). For this, Java provides the transient keyword
		 * 
		 * Fields marked as transient will be ignored during serialization and won't be saved
		 */
		
		/*
		 * Cloning In Java 
		 * 
		 * 
		 * Cloning in Java creates an exact copy of an object. The clone() method
		 * provides a mechanism for cloning, but it creates a shallow copy by default.
		 * To create deep copies, you need to manually clone referenced objects. A class
		 * must implement the Cloneable interface to enable cloning.
		 */
		
		/*Shallow Copy
		 * 
		 * 
		 * Shallow Copy: By default, the clone() method creates a shallow copy of the
		 * object. This means that the primitive fields are copied directly, but
		 * reference fields (such as objects) are not cloned; instead, the references
		 * are copied. Both the original and the cloned object will point to the same
		 * referenced objects.
		 */
		
		/*Deep Copy
		 * 
		 * Deep Copy: To create a deep copy (where the referenced objects are also
		 * cloned), you need to manually clone the referenced objects as well. This
		 * ensures that each object is fully duplicated and changes to one object don't
		 * affect the other.
		 */	
	}

}
