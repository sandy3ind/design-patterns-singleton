package com.javagain;

import java.lang.reflect.Constructor;

import com.javagain.singletons.EagerInitializedSingleton;
/**
 * This class will destroy Singleton pattern. When you run the above test class,
 *  you will notice that hashCode of both the instances are not same that destroys the singleton pattern.
 * @author Sandeep.Sharma
 *
 */
public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		
		try {
            Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
	}
}
