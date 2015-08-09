package Pop.Exceptions;

import java.text.ParseException;

public class ValidaException extends ParseException{

	public ValidaException(String s, int errorOffset) {
		super(s, errorOffset);
		// TODO Auto-generated constructor stub
	}

}
