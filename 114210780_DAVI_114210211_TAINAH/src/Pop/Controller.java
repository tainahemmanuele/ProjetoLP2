package Pop;

import java.util.ArrayList;

import Pop.Exceptions.LoginException;
import Pop.Exceptions.LogoutException;
import Pop.Exceptions.UsuarioException;

public class Controller {
	private Usuario usuario;
	private ArrayList <Usuario> usuarios;
	private String retorno;
	private boolean status;
	
	public Controller(){
		this.usuarios = new ArrayList<Usuario>();
		this.retorno = "";
		this.status = false;
	}

	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone){
		this.usuario = new Usuario(nome,email,senha,dataNascimento,telefone);
		this.usuarios.add(this.usuario);
		return usuario.getEmail();
	}
	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone, String foto){
		this.usuario= new Usuario(nome,email,senha,dataNascimento,telefone,foto);
		this.usuarios.add(this.usuario);
		return usuario.getEmail();
	}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento){
		this.usuario= new Usuario(nome,email,senha,dataNascimento);
		this.usuarios.add(this.usuario);
		return usuario.getEmail();
	}
	
	public String getNome(String email) throws UsuarioException {
		for(Usuario usuario: usuarios){
			if (usuario.getEmail().equals(email)){
				retorno = usuario.getNome();
				return retorno;
			}
			
		}
		if (retorno.equals("")){
			retorno = email;
			System.out.println("O usuario com email "+email + " nao esta cadastrado.");
			return retorno;
			//throw new UsuarioException ("O usuario com email "+email + " nao esta cadastrado.");
		}
		return email;
			
	}
	    
	    public String pesquisaUsuario(String email, String senha){
	    	for (Usuario usuario :usuarios){
	    		if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
	    			status = true;
	    			return usuario.getNome();
	    			
	    		}
	    	}
			return usuario.getNome();
	    }
	    
	    public void login (String email, String senha) throws LoginException{
	    	if (status == false){
	           String usuario = pesquisaUsuario(email, senha);
	    	}else{
	    		throw new LoginException ("Nao foi possivel realizar login. Um usuario ja esta logado:" +usuario );
	    	}
	    }
	    	
	    public void logout() throws LogoutException{
	    		if (status == true){
	    			status = false;
	    		} else{
	    			throw new LogoutException ("Nao eh possivel realizar logout. Nenhum usuario esta logado no +pop.");
	    		}
	    	}
}
