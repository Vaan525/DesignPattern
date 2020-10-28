package vaan.design.singleton;

public class LazyInitializationWithSynchronized {

	private static LazyInitializationWithSynchronized uniqueInstance;
	
	private LazyInitializationWithSynchronized() {}
	
	// Lazy Initialization
	public static synchronized LazyInitializationWithSynchronized getInstance() {
		if(uniqueInstance == null) {
	         uniqueInstance = new LazyInitializationWithSynchronized();
	      }
	      return uniqueInstance;
	}
}
