package org.namespace.my.myschema;

public final class ColorDelegate {
	private ColorDelegate() {}
	
	public static String hexCode(Color color) {
		switch (color) {
			case RED:
				return "0xFF0000";
			case GREEN:
				return "0x00FF00";
			case BLUE:
				return "0x0000FF";
		}
		throw new AssertionError();
	}
}
