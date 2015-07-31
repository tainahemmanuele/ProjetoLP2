package Pop;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private String imagem;
    private String atualiza;
    private String senhaAtual;
	private Scanner ler = new Scanner(System.in);
    
    public Usuario(String nome, String email, String senha, String dataNascimento, String imagem){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.imagem = imagem;
    	this.dataNascimento = dataNascimento;
    }


    public Usuario(String nome, String email, String senha, String dataNascimento){
    	this.nome = nome;
    	this.email = email;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
    	this.imagem = "resources/default.jpg";
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
	
	public void atualizaNome(){
		atualiza = ler.nextLine();
		ler.nextLine();
		nome = atualiza;
	}

	public void atualizaImagem(){
		atualiza = ler.nextLine();
		ler.nextLine();
		imagem = atualiza;
	}
	
	public void atualizaEmail(){
		atualiza = ler.nextLine();
		ler.nextLine();
		email = atualiza;
	}
	
	public void atualizaDataNascimento(){
		atualiza = ler.nextLine();
		ler.nextLine();
		dataNascimento = atualiza;
	}
	
	public void atualizaTelefone(){
		atualiza = ler.nextLine();
		ler.nextLine();
		telefone = atualiza;
	}
	
	public void atualizaSenha(){
		senhaAtual =  ler.nextLine();
		ler.nextLine();
		if (senhaAtual.equals(senha)){
			atualiza = ler.nextLine();
			senha = atualiza;
		}
	}
	@Override
	public String toString() {
		return "Usuario [getNome()=" + getNome() + ", getEmail()=" + getEmail()
				+ ", getSenha()=" + getSenha() + ", getDataNascimento()="
				+ getDataNascimento() + ", getTelefone()=" + getTelefone()
				+ ", getImagem()=" + getImagem() + "]";
	}
    
	
   
}
