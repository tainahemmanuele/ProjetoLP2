package Pop;

import java.util.ArrayList;

import Pop.Exceptions.InfoUsuarioException;
import Pop.Exceptions.LoginException;
import Pop.Exceptions.LogoutException;
import Pop.Exceptions.UsuarioException;
import Pop.Exceptions.PesquisaUsuarioException;

public class Controller {
	private Usuario usuario;
	private ArrayList <Usuario> usuarios;
	private boolean retorno;
	private boolean status;
	private String nomeUsuario;
	
	public Controller(){
		this.usuarios = new ArrayList<Usuario>();
		this.retorno = false;
		this.status = false;
	}

	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone, String imagem){
		this.usuario= new Usuario(nome,email,senha,dataNascimento,telefone,imagem);
		this.usuarios.add(this.usuario);
		System.out.println(usuario.getImagem());
		return usuario.getEmail();
	} 
	
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNascimento, String telefone){
		this.usuario = new Usuario(nome,email,senha,dataNascimento,telefone);
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
				retorno = true;
				return usuario.getNome();
			}
			else{
				retorno = false;
			}
		};
		if (retorno == false){
			throw new UsuarioException ("O usuario com email "+email + " nao esta cadastrado.");
		}
	   return email;
			
	}
	    
	    public String pesquisaUsuario(String email, String senha) throws PesquisaUsuarioException {
	    	for (Usuario usuario :usuarios){
	    		if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
	    			status = true;
	    			return usuario.getEmail();
	    			
	    		}
	    		if ((usuario.getEmail().equals(email)) && !(usuario.getSenha().equals(senha))){
	    			throw new PesquisaUsuarioException("Nao foi possivel realizar login. Senha Invalida.");
	    		}
	    	}
    		if (status == false){
    			throw new PesquisaUsuarioException("Nao foi possivel realizar login. O usuario com email " + email+ " nao esta cadastrado.");
    		}
			return usuario.getEmail();
	    }
	    
	    
	    public void login (String email, String senha) throws LoginException, PesquisaUsuarioException{
	    	if (status == false){
	           nomeUsuario = pesquisaUsuario(email, senha);
	    	}else {
	    		throw new LoginException ("Nao foi possivel realizar login. Um usuario ja esta logado: " +usuario.getNome() + "." );
	    	}
	    }
	    	
	    public void logout() throws LogoutException{
	    		if (status == true){
	    			status = false;
	    		} else{
	    			throw new LogoutException();
	    		}
	    	}
	    
	    public String getInfoUsuarioLogado(String atributo) throws InfoUsuarioException{
	    	if(status == true){
	    		for(Usuario usuarioLogado: usuarios){
	    			if (usuarioLogado.getEmail().equals(nomeUsuario)){
	    				usuario = usuarioLogado;
	    			}
	    	}
	    	}
	        if (atributo.equals("Nome")){
	        	return usuario.getNome();
	        }
	        if (atributo.equals("Email")){
	        	return usuario.getEmail();
	        }
	        if (atributo.equals("Senha")){
	        	throw new InfoUsuarioException();
	        }
	        if(atributo.equals("Foto")){
	        	return usuario.getImagem();
	        }
	        	
	      
			return usuario.getEmail();
	    	
	    }
}
