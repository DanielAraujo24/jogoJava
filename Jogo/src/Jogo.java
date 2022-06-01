
import java.util.Random;
import java.util.Scanner;

public class Jogo {
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int escolha_computador;
		int escolha_usuario;
		
		System.out.println("Olá, qual o seu nome?");
		String nome = scan.nextLine();
		System.out.println("Seja bem vindo " + nome+" ! ");
		System.out.println(nome + ", você quer jogar uma partida?");
		System.out.println("Informe sua opção \n1 > Sim \n2 > Não");
		opcao = scan.nextInt();
		
		if(opcao == 2) {
			
			System.out.println("Tudo bem, quando estiver preparado me avise"); 
			
		}else if(opcao == 1) {
			System.out.println("Que bacana, então, o jogo é assim...");
			System.out.println("Eu vou escolher um numero de 1 a 10");
			System.out.println("Se você adivinhar qual é o número");
			System.out.println("Você sera o vencedor!!!");
			System.out.println("Entendeu? \n1 > Sim \n2 > Não");
			opcao = scan.nextInt();
		      
		      escolha_computador = gerador.nextInt(11);
		      
		      System.out.println("Ok, "+nome+". Eu ja escolhi!");
		      System.out.println("Agora é a sua vez de adivinhar!");
		      do {
		    	  escolha_usuario = scan.nextInt();
		    	  if(escolha_usuario != escolha_computador) {
		    		  System.out.println("Escolha errada, tente novamente!");
		    		  
		    	  }else{
		    		  System.out.println("Parabéns você conseguiu!!!");
		    	  }
		      }while(escolha_computador != escolha_usuario);  
		 
		      }		
		
	}

}
