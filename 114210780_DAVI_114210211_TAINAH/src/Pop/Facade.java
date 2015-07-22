package Pop;

import easyaccept.EasyAccept;

public class Facade {
	private Controller controller;
	
	public Facade(){
		this.controller = new Controller();
	}

	public Usuario cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone){
		return controller.cadastraUsuario(nome, email, senha, dataNascimento, telefone);
	}
	
	public Usuario cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone, String foto){
		return controller.cadastraUsuario(nome, email, senha, dataNascimento, telefone, foto);
	}
	
	public Usuario cadastraUsuario(String nome, String email, String senha, String dataNascimento){
		return controller.cadastraUsuario(nome, email, senha, dataNascimento);
	}
	public static void main(String[] args) {
		Facade facade = new Facade();
		Usuario usuario = facade.cadastraUsuario("Tainah", "tainah@email.com", "21563", "19111995", "25689347", "foto");
	    System.out.println(usuario.getNome());
	    System.out.println(usuario.getFoto());
		args = new String[] {"Pop.Facade", "diretorio_testes/use_case_1.txt"};
	    EasyAccept.main(args);
	}
}
