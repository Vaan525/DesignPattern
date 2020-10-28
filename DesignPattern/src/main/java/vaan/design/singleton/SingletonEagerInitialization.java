package vaan.design.singleton;

public class SingletonEagerInitialization {

	private static SingletonEagerInitialization uniqueInstance = new SingletonEagerInitialization();
	
	private SingletonEagerInitialization() {}
	
	public static SingletonEagerInitialization getInstance() {
		return uniqueInstance;
	}
	
	
	
	
}
