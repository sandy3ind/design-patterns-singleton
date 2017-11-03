package com.javagain.singletons;

/**
 * To overcome this situation with Reflection, Joshua Bloch suggests the use of Enum to implement Singleton design pattern.
 * As enums don’t have any constructor so it is not possible for Reflection to utilize it. 
 * Enums have their by-default constructor, we can’t invoke them by ourself. JVM handles the creation and 
 * invocation of enum constructors internally. As enums don’t give their constructor definition to the program, 
 * it is not possible for us to access them by Reflection also. Hence, reflection can’t break singleton 
 * property in case of enums
 * @author Sandeep.Sharma
 *
 */
public enum EnumSingleton {

	INSTANCE;

	public static void doSomething() {
		// do something
	}
}
