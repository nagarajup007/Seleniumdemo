package org.com;

public class Typesofvariables {
	int a=20;
	short pin = 9168;  //types of variable -Local and global
	long cell=9704752340l;
	byte house =3-7;
	float expendacture=1023.5f;
	double d=48975.34433;
	String name="nagaraju"; //instant variable(not static) for this we  need to create obj(instance) then call this
	boolean b=true;
	char c='m';
	
	public int getData() {
		return a=10;//local variable  
		

	}
	public static void main(String[] args) {
		Typesofvariables typ=new Typesofvariables();
		System.out.println(typ.a);
		System.out.println(typ.pin);
		System.out.println(typ.cell);
		int se=typ.getData();

		
	}

}
