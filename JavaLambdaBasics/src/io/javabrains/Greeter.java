package io.javabrains;

public class Greeter {
	
	public void greet(MyAdd g) {
		System.out.println(g.addFunction(5,6));
	}

	public static void main(String[] args) {
		Greeter g = new Greeter();
		
		MyLambda myLambdaFunction = () -> System.out.println("Hello World");
		MyAdd addFunction = (int a, int b) -> a+b;
		
		g.greet(addFunction);
		
	}

}
interface MyLambda {
	void foo();
}
interface MyAdd {
	int addFunction(int a, int b);
}
