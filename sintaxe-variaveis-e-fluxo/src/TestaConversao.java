
public class TestaConversao {
    
	public static void main(String[] args){
		
		float pontoFlutuante = 3.14f;
		
		double salario = 1270.50;
		int valor = (int) salario; 
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		String saudacao = "ola meu nome � ";
		String nome = "R�mulo";
		String continuacao = " e minha idade � ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
		
	}
}	
