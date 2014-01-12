
public class cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos las variables
		String nombre="programacion";
		char inicial;
		int longitud;
		String modificacion="";
		
		//imprimimos la cadena
		System.out.println("La cadena es: " +nombre);
		
		//almacenamos la longitud de la variable nombre en la variable longitud
		longitud=nombre.length();
		
		//imprimimos longitud
		System.out.println("La cadena es: "+nombre+" y la longitud es: "+ longitud);
		
		//almacenamos la inicial de programacion en la variable inicial
		inicial=nombre.charAt(0);
		
		//imprimimos la inicial de la cadena programacion
		System.out.println("La cadena es: "+nombre+" y la inicial " +inicial);
		
		//convertimos a mayusculas la variable nombre y la almacenamos en modificacion
		modificacion=nombre.toUpperCase();
		
		//imprimimos modificacion
		System.out.println("La cadena es: "+nombre+" y se modificara a "+modificacion);
		
		
		
		
		

	}

}
