package Pop.Exceptions;

public class UsuarioException extends Exception{
	
	public UsuarioException(String string) {
		super(string);
	}

	public UsuarioException() {
		super("Usuario nao esta cadastrado no +Pop");
	}

}
