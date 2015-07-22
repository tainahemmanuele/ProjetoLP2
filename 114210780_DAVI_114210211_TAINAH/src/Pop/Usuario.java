package Pop;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private String foto;
    
    public Usuario(String nome, String email, String senha, String dataNascimento, String telefone){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
    	this.telefone = telefone;
    	this.foto = "default";
    }
    
    public Usuario(String nome, String email, String senha, String dataNascimento, String telefone, String foto){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
    	this.telefone = telefone;
    	this.foto = foto;
    }

    public Usuario(String nome, String email, String senha, String dataNascimento){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
    	this.telefone = "default";
    	this.foto = "default";
    }
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getFoto() {
		return foto;
	}
    
	@Override
	public String toString() {
		return getNome();
	}

   
}
