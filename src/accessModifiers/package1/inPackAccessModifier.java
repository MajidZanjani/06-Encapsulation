package accessModifiers.package1;

public class inPackAccessModifier extends MyClass {

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		myClass.protectedVoidMyClass();
		
		myClass.publicVoidMyClass();
		
		myClass.defaultVoidMyClass();
		
		//myClass.privateVoidMyClass();  // Compile Error

	}

}
