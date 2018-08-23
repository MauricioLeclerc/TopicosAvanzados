public class Calculadora {
	
	public double sumar(double a, double b){
		if ((a+b)>Double.MAX_VALUE) {
			return Double.MAX_VALUE+1;
		}
		else{
			return a+b;
		}
	}
	
	public double restar(double a, double b){
		return a-b;
	}
	
	public double multiplicar(double a, double b){
		return a*b;
	}
	
	public double dividir(double a, double b){
		return a/b;
	}
}
