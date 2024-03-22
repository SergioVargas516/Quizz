import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Empleado empleado1 = new Empleado(null,0,0,null);
		Scanner entrada = new  Scanner(System.in);
		System.out.println("Ingrese los siguientes datos");
		System.out.println("Nombre: ");
		empleado1.setNombre(entrada.nextLine());
		System.out.println("Edad: ");
		empleado1.setEdad(entrada.nextInt());
		System.out.println("Salario: ");
		empleado1.setSalario(entrada.nextDouble());
		System.out.println("Cargo:");
		empleado1.setCargo(entrada.nextLine());
		empleado1.setCargo(entrada.nextLine());
		
		System.out.println("Empleado: \n"+empleado1.toString());
		System.out.println("\n \n");
		System.out.println("Preguntas");
		System.out.println("***************************");
		responderPreguntas();
	
	}
	
	public static void responderPreguntas() 
	{
	 		
		System.out.println("1.¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?");
		System.out.println("R: Personasolamente tiene 2 atributos y empleado hereda los atributos de persona y a tiene atributos propios");
		System.out.println(" ");
		System.out.println("2.¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
		System.out.println("Luego de crear la clase se agrega comando \"extends\" y se pone el nombre de la superclase");
		System.out.println(" ");
		System.out.println("3.¿Qué es un constructor en Java y cuál es su propósito?");
		System.out.println("R: Sirve para crear un objeto y establecer sus propiedades");
		System.out.println(" ");
		System.out.println("4.¿Por qué es útil utilizar la herencia en la programación orientada a objetos?");
		System.out.println("R: Para evitar la repeticion de atributos");
		System.out.println(" ");
		System.out.println("5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?");
		System.out.println("R: Instanciación");
	}
}
