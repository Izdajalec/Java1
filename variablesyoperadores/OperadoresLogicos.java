package variablesyoperadores;

public class OperadoresLogicos {
   public static void main (String[] args) {
	   
	   
	   
	   int z=10;
	   int r=9;
	   System.out.println(r>z);
	   
	   int x=90;
		System.out.println(z<r || x>r);
	    System.out.println(z<r && x>r);
	   
	   String cadena=z<r?"Si":"No"; //if (z<r) "if" else "no"
	   System.out.println(cadena); 
	   
	   int p=9;
	   
	    
	   
	   String par=p%2==0?"Es par":"No es par";
		   System.out.println(par);
	   
   }
}
