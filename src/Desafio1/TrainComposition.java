package Desafio1;
import java.util.*;

public class TrainComposition {
	
	static Deque<Integer> Vagao = new ArrayDeque<Integer>();
	
	public static void main(String[] args) {
		String Continue = "s";
		TrainComposition trn = new TrainComposition();
		try {
				while(Continue.equals("s")) {
		
					Scanner Scn = new Scanner(System.in);
					System.out.println("Gostaria de inserir ou remover um vag�o? (i/r)");
					String InputData = Scn.nextLine();
					
					if(InputData.equals("i"))
						trn.InserirVagao();
					else if(InputData.equals("r"))
						trn.RemoveVagao();
					else
						System.out.println("caractere inv�lido");
					
					
					Scanner AwrContinue = new Scanner(System.in);
					System.out.println("gostaria de continuar a opera��o? (s/n)");
					Continue = AwrContinue.nextLine();
				}
			
			System.out.println("Opera��o finalizada, vag�es do trem");
			
			for(int num : Vagao) { System.out.print("[" + num +"]");}
			
		}catch(Exception e) {
			System.out.println("caractere inv�lido opera��o incerrada");
		}
	}

	//m�todo que inseri os vag�es
	public void InserirVagao() {
		try {
			Scanner Sc = new Scanner(System.in);
			System.out.println("Insira o n�mero do vag�o que ir� atracar");
			int Composition = Sc.nextInt();
			
			Scanner Awr = new Scanner(System.in);
			System.out.println("Qual o lado que o vag�o ir� atracar, esquerda ou direita? (e/d)");
		
			if(Awr.nextLine().toLowerCase().equals("e"))
				Vagao.addFirst(Composition);
			else if(Awr.nextLine().toLowerCase().equals("d"))
				Vagao.addLast(Composition);
			else
				System.out.println("Op��o n�o dispon�vel");
			
		}catch(Exception e) {
			System.out.println("caractere inv�lido");
		}
		
	}
	
	//m�todo que remove os vag�es
	public void RemoveVagao() {
		try {		
			Scanner Awr = new Scanner(System.in);
			System.out.println("Qual o lado que o vag�o ir� desatracar,pelo lado esquerdo ou  pelo lado direito? (e/d)");
			String InputRemove = Awr.nextLine();
			
			//verifica se j� existe um vag�o para se removido 
			if(Vagao.isEmpty()) {
				
				System.out.println("n�o existe nenhum vag�o para ser removido");

			}else {
				
				if(InputRemove.toLowerCase().equals("e"))
					Vagao.removeFirst();
				else if(InputRemove.toLowerCase().equals("d"))
					Vagao.removeLast();
				else
					System.out.println("Op��o n�o dispon�vel");
			}
		}catch(Exception e) {
			System.out.println("caractere inv�lido");
		}
	}
}
