package com.camelofalkhoarizmi.test;

import org.junit.Before;
import org.junit.Test;

import com.camelofalkhoarizmi.core.Camel;

/**
 * Camel test class
 * 
 * @author Ethem Kurt
 * @version 1.0.0
 * @since 1.0.0
 */
public class CamelTest {

	/**
	 * Camel
	 */
	private Camel camel;

	/**
	 * Before test
	 * 
	 * @throws Exception
	 *             Exception
	 */
	@Before
	public void setUp() throws Exception {
		camel = new Camel(3);
	}

	/**
	 * Test
	 */
	@Test
	public void test() {
		System.out.println("The camel shat at " + camel.getRadians() + " radians,\nwhile pooping " + camel.getTurds()
				+ ((camel.getTurds() == 1) ? " turd." : " turds."));
	}

}
