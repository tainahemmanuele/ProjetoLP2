package Pop;

import Pop.Exceptions.LoginException;
import Pop.Exceptions.LogoutException;
import Pop.Exceptions.UsuarioException;
import easyaccept.EasyAccept;

public class Facade {
	private Controller controller;
	
	public Facade(){
		this.controller = new Controller();
	}

	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone){
		return controller.cadastraUsuario(nome, email, senha, dataNascimento, telefone);
	}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone, String foto){
		return controller.cadastraUsuario(nome, email, senha, dataNascimento, telefone, foto);
	}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento){
		return controller.cadastraUsuario(nome, email, senha, dataNascimento);
	}
	
	public String getNome(String email) throws UsuarioException {
		return controller.getNome(email);
	}
	
	public void login (String email, String senha) throws LoginException{
		controller.login(email, senha);
	}
	
	public void logout() throws LogoutException{
	    controller.logout();
	}
	
	public static void main(String[] args) throws UsuarioException {
		Facade facade = new Facade();
		facade.cadastraUsuario("Tainah", "tainah@email.com", "21563", "19111995", "25689347", "foto");
		System.out.println(facade.getNome("marina@email.com"));
		args = new String[] {"Pop.Facade", "diretorio_testes/use_case_1.txt"};
	    EasyAccept.main(args);
	}
}
