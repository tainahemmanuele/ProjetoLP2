package Pop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import Pop.Exceptions.CadastroUsuarioException;
import Pop.Exceptions.DataException;
import Pop.Exceptions.ValidaException;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private String imagem;
    private String atualiza;
    private String senhaAtual;
    DateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat data2 = new SimpleDateFormat("yyyy-MM-dd");
	private Scanner ler = new Scanner(System.in);
	private boolean statusData = false;
    
    public Usuario(String nome, String email, String senha, String dataNascimento, String imagem) throws CadastroUsuarioException, ParseException{
    	if(nome.equals("")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else if(nome.startsWith(" ")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else{
        	this.nome = nome;
    	}
    	
    	this.dataNascimento = converteData(dataNascimento);
    	
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
    	
		
    	
    	
    }


    public Usuario(String nome, String email, String senha, String dataNascimento) throws CadastroUsuarioException, ParseException {
    	if(nome.equals("")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else if(nome.startsWith(" ")){
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");
    	}else{
        	this.nome = nome;
    	}
    	
    	validaData(dataNascimento);
    	this.dataNascimento = converteData(dataNascimento);
    	
    	if((email.endsWith(".com")== true) && (email.endsWith(".com.br")==false)){
    		this.email = email;
    	}
    	else if((email.endsWith(".com")== false) && (email.endsWith(".com.br")==true)){
    		this.email = email;
    	}else{
    		throw new CadastroUsuarioException("Erro no cadastro de Usuarios. Formato de e-mail esta invalido.");
    	}

    	this.senha = senha;
    	
    	

			/*try {
				data = data1.parse(dataNascimento);
				this.dataNascimento = data2.format(data);
			} catch (ParseException e) {
				throw new DataException("Erro no cadastro de Usuarios. Formato de data esta invalida.", 1);
			}
			

				Calendar dataValida = Calendar.getInstance();
				dataValida.setTime(data);*/


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
	
	
	public String converteData(String dataNascimento) throws ParseException {
		Date data;
		 try{
		     data1.setLenient(false);
			 data = data1.parse(dataNascimento); 

		} catch (ParseException e){  
		  
		       throw new DataException("Erro no cadastro de Usuarios. Formato de data esta invalida.", 2);
		    }  
		return data2.format(data);	
	}
	
	public String validaData(String dataNascimento) throws ParseException{
		try {  
		    Calendar dataValida = Calendar.getInstance();
			dataValida.setTime(data1.parse(dataNascimento));
	     } catch (ParseException e){  
	         throw new ValidaException("Erro no cadastro de Usuarios. Data nao existe.",1);
	        }
		return dataNascimento;
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
