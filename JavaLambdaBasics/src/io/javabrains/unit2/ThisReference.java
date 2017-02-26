package io.javabrains.unit2;

public class ThisReference {
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	public void execute() {
		doProcess(10, i -> System.out.println(this));
	}

	public static void main(String[] args) {
		ThisReference tr = new ThisReference();
		
		//tr.doProcess(10, i -> System.out.println(this)); This is not working
		
		tr.execute();

	}

}
interface Process {
	public void process(int i);
}
