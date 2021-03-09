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
					System.out.println("Gostaria de inserir ou remover um vagão? (i/r)");
					String InputData = Scn.nextLine();
					
					if(InputData.equals("i"))
						trn.InserirVagao();
					else if(InputData.equals("r"))
						trn.RemoveVagao();
					else
						System.out.println("caractere inválido");
					
					
					Scanner AwrContinue = new Scanner(System.in);
					System.out.println("gostaria de continuar a operação? (s/n)");
					Continue = AwrContinue.nextLine();
				}
			
			System.out.println("Operação finalizada, vagões do trem");
			
			for(int num : Vagao) { System.out.print("[" + num +"]");}
			
		}catch(Exception e) {
			System.out.println("caractere inválido operação incerrada");
		}
	}

	//método que inseri os vagões
	public void InserirVagao() {
		try {
			Scanner Sc = new Scanner(System.in);
			System.out.println("Insira o número do vagão que irá atracar");
			int Composition = Sc.nextInt();
			
			Scanner Awr = new Scanner(System.in);
			System.out.println("Qual o lado que o vagão irá atracar, esquerda ou direita? (e/d)");
		
			if(Awr.nextLine().toLowerCase().equals("e"))
				Vagao.addFirst(Composition);
			else if(Awr.nextLine().toLowerCase().equals("d"))
				Vagao.addLast(Composition);
			else
				System.out.println("Opção não disponível");
			
		}catch(Exception e) {
			System.out.println("caractere inválido");
		}
		
	}
	
	//método que remove os vagões
	public void RemoveVagao() {
		try {		
			Scanner Awr = new Scanner(System.in);
			System.out.println("Qual o lado que o vagão irá desatracar,pelo lado esquerdo ou  pelo lado direito? (e/d)");
			String InputRemove = Awr.nextLine();
			
			//verifica se já existe um vagão para se removido 
			if(Vagao.isEmpty()) {
				
				System.out.println("não existe nenhum vagão para ser removido");

			}else {
				
				if(InputRemove.toLowerCase().equals("e"))
					Vagao.removeFirst();
				else if(InputRemove.toLowerCase().equals("d"))
					Vagao.removeLast();
				else
					System.out.println("Opção não disponível");
			}
		}catch(Exception e) {
			System.out.println("caractere inválido");
		}
	}
}
