package com.corejava;
class Parent{
	Parent(){
		System.out.println("parent constructor called" +this.hashCode());
	}
}
class Child extends Parent{
	Child(){
		System.out.println("child constructor called" +this.hashCode());
	}
}

public class ChildObjectParentConstructor {

	public static void main(String[] args) {
		// Both parent & child constructor will be executed for child object purpose only.
		Child c = new Child();
		System.out.println(c.hashCode());
	}

}
