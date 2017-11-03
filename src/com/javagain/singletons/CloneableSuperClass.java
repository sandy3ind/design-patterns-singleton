package com.javagain.singletons;

/**
 * This cloneable super class can be subclassed by a singleton. 
 * 
 * @author Sandeep.Sharma
 *
 */
public class CloneableSuperClass implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
