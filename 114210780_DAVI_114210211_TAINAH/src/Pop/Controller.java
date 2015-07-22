package Pop;

import java.util.ArrayList;

public class Controller {
	private Usuario usuario;
	private ArrayList <Usuario> usuarios;
	
	public Controller(){
		this.usuarios = new ArrayList<Usuario>();
	}

	public Usuario cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone){
		this.usuario = new Usuario(nome,email,senha,dataNascimento,telefone);
		this.usuarios.add(this.usuario);
		return this.usuario;
	}
	public Usuario cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone, String foto){
		this.usuario= new Usuario(nome,email,senha,dataNascimento,telefone,foto);
		this.usuarios.add(this.usuario);
		return this.usuario;
	}
	
	public Usuario cadastraUsuario(String nome, String email, String senha, String dataNascimento){
		this.usuario= new Usuario(nome,email,senha,dataNascimento);
		this.usuarios.add(this.usuario);
		return this.usuario;
	}
}
