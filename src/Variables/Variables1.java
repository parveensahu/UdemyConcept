package Variables;
//Catch is if you store the object of extended class in base class reference variable then only base class variables and functions it will know
//This logic will not work in case of overriding
//Here in example v is the object of base class and print is the overriden method
public class Variables1 extends VariablesConcept {
	public void print() {
		System.out.println("Overwritten method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesConcept v = new Variables1();
		v.$_print();
		System.out.println(v.x);
		System.out.println(v.z);
	}

}
