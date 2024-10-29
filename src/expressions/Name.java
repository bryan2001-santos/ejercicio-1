package expressions;

public class Name {
	
	public static void main(String[] args) {
	
		Name n = new Name();
		
	String c = "\u00A9";
	String b = "\u0040";
	String a = "\u00AB";
	
	
	
	System.out.println(c + " " + "Bryan Santos Novas " + "" +  b + 
			 "\n"+ a + "\u00BD" + " of the World is suffering from malnutrition 	" + "\u00BB" + 
			"\n" +  a + "The average tempreature of the planet is 13 " + "\u2103" + "\u00BB" + "\n");
	
	byte p = 125;
	byte d = 37;
	byte t = 12;
	
	double x = n.duration(p, d, t);
	
	//al llamar a un metodo que no sea estatico o void ,debemos de instanciarla para poderla llamar en el main.
	// el ejemplo seria instanciarla con el nombre de la clase, en mi caso,"llamado Name". ejemplo: Name n = new Name();
	
	// sin embargo podemos llamar al metodo directamente desde el syso sin necesidad de inicializar
	// variable
	
	System.out.println(x);
	System.out.printf("%.0f%n",x); // or ((int)x)
	System.out.printf( "%.2f", x);
	
	
	System.out.println(d % t);
	
	// se coloca en la salida de datos el del printf el %.2 pero con la f para manejar la parte de los decimales.
	}
	
	public double duration(byte power,byte distance, byte time) {
		 return (double) (power * distance) / time;
		 
		 // al final tuve que castear el return a double ya que los numeros entre parentesis son byte
		 // y esto hace que mi operacion no se vea en decimal, si no enteros, por tanto debo de forzar al menos un numero
		 // a que su valor sea con decimal y asi se realize dicha operacion. Siempre que querramos un resultado con decimal
		 // y los numeros a calcular sean enteros, debemos de castear.	
	
		 // es esencial saber que todo metodo dependera siempre de su valor entre parentesis.
		
		  
		 
	}
}
