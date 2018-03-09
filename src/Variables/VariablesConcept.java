package Variables;

public class VariablesConcept {
	//InstanceVariables
	int x;
	//x=10;  can not be reinitialized
	String str;
	//staticVariables
	static int z = 20;
	//z = 40; can not be reinitialized
	public void $_print() {
		int y; //Local variable
		y=10;
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesConcept vc = new VariablesConcept();
		vc.$_print();
		System.out.println(vc.z);
		System.out.println(vc.str);
	}

}
