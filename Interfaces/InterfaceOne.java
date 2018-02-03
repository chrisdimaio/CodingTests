interface TestInterface {
	 public void methodA();
	 public String  methodB();
}

public class InterfaceOne implements TestInterface {
	public static void main(String[] args){
		InterfaceOne int1 = new InterfaceOne();
		
		int1.methodA();
		System.out.println(int1.methodB());
	}
	
	public void methodA(){
		System.out.println("Method A implementation.");
	}
	
	public String methodB(){
		return "Method B implementation";
	}
}