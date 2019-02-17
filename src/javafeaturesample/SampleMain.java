package javafeaturesample;

import java.util.function.Function;

public class SampleMain {

	public static void main(String[] args) {
		Function<String, Integer> functionalInstance = arg -> Integer.parseInt(arg)+10;
		System.out.println(functionalInstance.apply("10"));
		System.out.println(staticfunctionalInstance.apply("5"));

	}
	
	public static Function<String, Integer> staticfunctionalInstance = arg -> Integer.parseInt(arg)+10;
	

}
