package de.inseltroll.inselmoduletest.lib;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author maz
 */
public class LibClass {
	private static final Logger LOGGER = LoggerFactory.getLogger(LibClass.class);

	public static void greet() {
		LOGGER.info("Hello World");

		System.out.println("Hello world!");
	}

	public static void testJava7() {
		ArrayList<String> strings = new ArrayList<>();
	}
}
