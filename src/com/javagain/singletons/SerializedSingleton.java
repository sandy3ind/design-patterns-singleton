package com.javagain.singletons;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final SerializedSingleton instance = new SerializedSingleton();

	// private constructor to avoid client applications to use constructor
	private SerializedSingleton() {
	}

	public static SerializedSingleton getInstance() {
		return instance;
	}
	
	/**
	 * Prevent breaking of singleton while de-serialize singleton object
	 * 
	 * @return
	 */
	protected Object readResolve() {
        return instance;
    }

}
