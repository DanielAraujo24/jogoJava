
import java.util.Random;
import java.util.Scanner;

public class Jogo {
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int escolha_computador;
		int escolha_usuario;
		
		System.out.println("Ol�, qual o seu nome?");
		String nome = scan.nextLine();
		System.out.println("Seja bem vindo " + nome+" ! ");
		System.out.println(nome + ", voc� quer jogar uma partida?");
		System.out.println("Informe sua op��o \n1 > Sim \n2 > N�o");
		opcao = scan.nextInt();
		
		if(opcao == 2) {
			
			System.out.println("Tudo bem, quando estiver preparado me avise"); 
			
		}else if(opcao == 1) {
			System.out.println("Que bacana, ent�o, o jogo � assim...");
			System.out.println("Eu vou escolher um numero de 1 a 10");
			System.out.println("Se voc� adivinhar qual � o n�mero");
			System.out.println("Voc� sera o vencedor!!!");
			System.out.println("Entendeu? \n1 > Sim \n2 > N�o");
			opcao = scan.nextInt();
		      
		      escolha_computador = gerador.nextInt(11);
		      
		      System.out.println("Ok, "+nome+". Eu ja escolhi!");
		      System.out.println("Agora � a sua vez de adivinhar!");
		      do {
		    	  escolha_usuario = scan.nextInt();
		    	  if(escolha_usuario != escolha_computador) {
		    		  System.out.println("Escolha errada, tente novamente!");
		    		  
		    	  }else{
		    		  System.out.println("Parab�ns voc� conseguiu!!!");
		    	  }
		      }while(escolha_computador != escolha_usuario);  
		 
		      }		
		
	}

}
