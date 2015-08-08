package Pop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Pop.Exceptions.CadastroUsuarioException;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private String imagem;
    private String atualiza;
    private String senhaAtual;
    //SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	private Scanner ler = new Scanner(System.in);
    
    public Usuario(String nome, String email, String senha, String dataNascimento, String imagem) throws CadastroUsuarioException{
    	if(nome.equals("")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else if(nome.startsWith(" ")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else{
        	this.nome = nome;
    	}
    	if((email.endsWith(".com")== true) && (email.endsWith(".com.br")==false)){
    		this.email = email;
    	}
    	else if((email.endsWith(".com")== false) && (email.endsWith(".com.br")==true)){
    		this.email = email;
    	}else{
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Formato de e-mail esta invalido.");
    	}
    	
    	this.senha = senha;
    	this.imagem = imagem;
    	this.dataNascimento = dataNascimento;
    	
    }


    public Usuario(String nome, String email, String senha, String dataNascimento)throws CadastroUsuarioException{
    	if(nome.equals("")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else if(nome.startsWith(" ")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else{
        	this.nome = nome;
    	}
    	if((email.endsWith(".com")== true) && (email.endsWith(".com.br")==false)){
    		this.email = email;
    	}
    	else if((email.endsWith(".com")== false) && (email.endsWith(".com.br")==true)){
    		this.email = email;
    	}else{
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Formato de e-mail esta invalido.");
    	}

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
