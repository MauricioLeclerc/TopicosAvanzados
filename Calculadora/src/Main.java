public class Main {
	
	public static void main(String [] args){
		//Instancio un objeto Calculadora.
		Calculadora calc= new Calculadora();
		
		//Suma de 2 numeros cualquiera.
		double suma=calc.sumar(5, 11);
		System.out.println(suma);
		
		//Suma de 2 numeros negativos.
		double suma2=calc.sumar(-8, -4);
		System.out.println(suma2);
				
		//Suma de MAX_VALUE y otro numero cualquiera.
		double suma3=calc.sumar(Double.MAX_VALUE, 24);
		System.out.println(suma3);
		
		//Resta de 2 numeros cualquiera.
		double resta=calc.restar(18, 4);
		System.out.println(resta);
		
		//Multiplicacion de 2 numeros cualquiera.
		double mult=calc.multiplicar(8, 5);
		System.out.println(mult);
		
		//Division de 2 numeros cualquiera.
		double div=calc.dividir(15, 3);
		System.out.println(div);
	}
}