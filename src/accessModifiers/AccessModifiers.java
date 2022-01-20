package accessModifiers;

import accessModifiers.package1.MyClass;

public class AccessModifiers extends MyClass {

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		 //myClass.protectedVoidMyClass();  // Compile Error
		
		myClass.publicVoidMyClass();
		
		//myClass.defaultVoidMyClass();  // Compile Error
		
		//myClass.privateVoidMyClass();  // Compile Error
		

	}

}
