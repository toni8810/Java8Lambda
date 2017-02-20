package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLengthLambda myLam = s -> s.length();
		System.out.println(myLam.getLength("Yo Lambda"));

	}

}
interface StringLengthLambda {
	int getLength(String s);
}
