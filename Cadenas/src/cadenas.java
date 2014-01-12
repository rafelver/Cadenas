
public class cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos las variables
		String nombre="programacion";
		char inicial;
		int longitud;
		String modificacion="";
		//creamos nueva variable
		int longitud2;
		
		//imprimimos la cadena
		System.out.println("La cadena es: " +nombre);
		
		//almacenamos la longitud de la variable nombre en la variable longitud	
		longitud=nombre.length();
		
		//almacenamos  longitud en longitud2
		longitud2=longitud;
		
		//imprimimos longitud
		System.out.println("La cadena es: "+nombre+" y la longitud es: "+ longitud);
		//cambiamos longitud2 y la imprimimos
		longitud2=25;
		System.out.println(longitud2);
		
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
