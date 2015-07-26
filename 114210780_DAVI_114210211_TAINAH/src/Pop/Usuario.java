package Pop;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private String imagem;
    
    public Usuario(String nome, String email, String senha, String dataNascimento, String imagem, String telefone){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
    	this.telefone = telefone;
    	this.imagem = imagem;
    }

	public Usuario(String nome, String email, String senha, String dataNascimento, String imagem){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
    	this.telefone = "default";
    	this.imagem= imagem;
    }
    
    public Usuario(String nome, String email, String senha, String dataNascimento){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
        this.telefone = "default";
    	this.imagem = "default";
    }
	
    
    public void setImagem(String imagem) {
		this.imagem = imagem;
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

	public String getImagem() {
		return imagem;
	}

	@Override
	public String toString() {
		return "Usuario [getNome()=" + getNome() + ", getEmail()=" + getEmail()
				+ ", getSenha()=" + getSenha() + ", getDataNascimento()="
				+ getDataNascimento() + ", getTelefone()=" + getTelefone()
				+ ", getImagem()=" + getImagem() + "]";
	}
    
	
   
}
