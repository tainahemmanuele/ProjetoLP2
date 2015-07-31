package Pop;

import java.util.ArrayList;
import java.util.Scanner;

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
	private boolean statusSistema;
	private boolean statusUsuario;

	
	public Controller(){
		this.usuarios = new ArrayList<Usuario>();
		this.retorno = false;
		this.status = false;
		this.statusSistema = false;
		this.statusUsuario = false;
	}

	public void iniciaSistema(){
		statusSistema = true;
		
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
			throw new UsuarioException ("Um usuarix com email "+email + " nao esta cadastradx.");
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
	    			throw new PesquisaUsuarioException("Nao foi possivel realizar login. Senha invalida.");
	    		}
	    	}
    		if (status == false){
    			throw new PesquisaUsuarioException("Nao foi possivel realizar login. Um usuarix com email " + email+ " nao esta cadastradx.");
    		}
			return usuario.getEmail();
	    }
	    
	    
	    public void login (String email, String senha) throws LoginException, PesquisaUsuarioException{
	    	if (status == false){
	           nomeUsuario = pesquisaUsuario(email, senha);
	    	}else {
	    		throw new LoginException ("Nao foi possivel realizar login. Um usuarix ja esta logadx: " +usuario.getNome() + "." );
	    	}
	    }
	    	
	    public void logout() throws LogoutException{
	    		if (status == true){
	    			status = false;
	    		} else{
	    			throw new LogoutException();
	    		}
	    	}
	    
	 
	    
	    public String getInfoUsuario(String atributo,String email) throws InfoUsuarioException{
	       for(Usuario usuarioLogado: usuarios){
	    		if (usuarioLogado.getEmail().equals(email)){
	    			usuario = usuarioLogado;
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
	        if(atributo.equals("Data de Nascimento")){
	        	return usuario.getDataNascimento();
	        }
	        
			return usuario.getEmail();
	    }
	    	
	    public String getInfoUsuario(String atributo) throws InfoUsuarioException{
	    	if (status ==true){
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
        if(atributo.equals("Data de Nascimento")){
        	return usuario.getDataNascimento();
        }	
      
		return usuario.getEmail();
    }
    	
	    
	    public void fechaSistema() throws InfoUsuarioException{
	    	if(status == true){
	    		throw new InfoUsuarioException("Nao foi possivel fechar o sistema. Um usuarix ainda esta logadx.");
	    	}else{
	    		statusSistema = false;
	    	}
	    }
	    
	    public void atualizaInfo(String info){
	    	if(status == true){
	    		for(Usuario usuarioLogado: usuarios){
	    			if (usuarioLogado.getEmail().equals(nomeUsuario)){
	    				usuario = usuarioLogado;
	    			}
	    	}
	    	}
	    	if (info.equals("Nome")){
	        	usuario.atualizaNome();
	        }
	        if (info.equals("Email")){
	        	usuario.atualizaEmail();
	        }
	        if (info.equals("Senha")){
	        	usuario.atualizaSenha();
	        }
	        if(info.equals("Foto")){
	        	usuario.atualizaImagem();
	        }
	        if(info.equals("Data de Nascimento")){
	        	usuario.atualizaDataNascimento();
	        }
	        
	        
	        if(info.equals("Telefone")){
	        	usuario.atualizaTelefone();
	        }
	        	
	    	
	    }
}
