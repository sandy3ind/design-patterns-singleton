package com.javagain.singletons;

/**
 * This singleton class is extending a super class which is a cloneable. Singleton can be broken if client make 
 * object of this class. It can be avoided by overriding clone method
 * 
 * @author Sandeep.Sharma
 *
 */
public class CloneableSingleton extends CloneableSuperClass {
	private static final CloneableSingleton instance = new CloneableSingleton();

	// private constructor to avoid client applications to use constructor
	private CloneableSingleton() {
	}

	public static CloneableSingleton getInstance() {
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// throw exception to avoid duplicate singleton object
		//throw new CloneNotSupportedException();
		
		// If you dont want to throw exception then return same instance
		return instance;
	}
}
