package Main;

import Classes.Tarefas;
import Classes.Usuario;

public class Chamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario U = new Usuario("Leonardo","Leocaradepneu@gmail.com","Suporte TI");
		U.show();
		Tarefas T = new Tarefas("Em Aberto",U,"Tarefa","Fazer Tarefa");
		T.show();
		

	}

}
