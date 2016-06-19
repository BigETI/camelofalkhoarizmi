package com.camelofalkhoarizmi.core;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Camel class
 * 
 * @author Ethem Kurt
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class Camel {

	/**
	 * Turds
	 */
	private int turds;

	/**
	 * Radians
	 */
	private BigDecimal radians;

	/**
	 * Constructor, defining how many times this camel poops turds, before
	 * disappearing
	 * 
	 * @param turds
	 *            Turds
	 * @throws IllegalArgumentException
	 *             If "turds" is negative
	 */
	public Camel(int turds) throws IllegalArgumentException {
		if (turds <= 0)
			throw new IllegalArgumentException("Camels can't poop " + turds + " times.");
		this.turds = turds;
		radians = (new BigDecimal(turds - 1)).multiply(new BigDecimal(2))
				.divide(new BigDecimal(1).add(new BigDecimal(Math.sqrt(5.0))), 256, RoundingMode.CEILING)
				.remainder(BigDecimal.ONE);
	}

	/**
	 * Get turds
	 * 
	 * @return Turds
	 */
	public int getTurds() {
		return turds;
	}

	/**
	 * Get radians
	 * 
	 * @return Radians
	 */
	public BigDecimal getRadians() {
		return radians;
	}

}
