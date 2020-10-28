package vaan.design.singleton;

public class DCL_ThreadSafe {

	private static DCL_ThreadSafe uniqueInstance;
	
	private DCL_ThreadSafe() {}
	
	// Lazy Initialization
	public static synchronized DCL_ThreadSafe getInstance() {
		if(uniqueInstance == null) {
	         uniqueInstance = new DCL_ThreadSafe();
	      }
	      return uniqueInstance;
	}
}
