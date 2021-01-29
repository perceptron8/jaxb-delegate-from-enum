package org.namespace.my.myschema;

import generated.MyType;

public class Delegate {
	public static int hashCode(MyType myType) {
		return myType.getCreatedAt().hashCode() ^ myType.getName().hashCode();
	}
}
