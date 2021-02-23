package variablesyoperadores;

public class Variables1 {
	
	private static final String Urankar = null;

	public static void main(String[] args) {
		
		boolean v=true;
		char letra='x'; //CON COMILLA SIMPLE
		double d1=3.10;
		long l=189090;
		int i=10;  //32
	    short s=100; //16
		float f=2;
		byte b=127 ;
		
		//Variables con Nombre y Apellido. Variables con salario e IRPF, visualizar todo
		//Te llamas ... ganas X euros y tus impuestos son IRPF
		
 String nombre="Gabriel";
		
String apellido="Urankar";
		
long salario=1300 ; 

int IRPF=5;

long impuesto=salario/IRPF;

System.out.println("Tu nombre es "+nombre+" "+apellido+ " " +"tu salario es " + " "+ salario +"y tienes un irpf de " + impuesto);

	


		
		
	}

}
