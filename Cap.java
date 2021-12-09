package com.technoelevate.third;

public class Cap {
 public static void run() {
	 System.out.println("run 10 min");

}
 public static void sleep1(){
	 System.out.println("sleep 20hrs");
	 
 }
 public void run1() {
	 System.out.println("run until tired");
	 
 }
 public void sleep() {
	 System.out.println("sleep at morning");
	 
 }
 public void eat() {
	 System.out.println("eat biryani");
 }
 
 public static void main(String[] args) {
	 Cap.run();
	 Cap.sleep1();
	 
	 Cap c = new Cap();
	 c.eat();
	 c.run1();
	 c.sleep();
 }
 
 
}

