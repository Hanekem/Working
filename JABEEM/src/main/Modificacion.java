package main;

public class Modificacion extends Operation {
	/* prolly the biggest class, with only two items we can work it here, use an overloaded function because the input is distinct
	 but I could make a class for each type of modification either as child of operation or af child of modificacion  */
	void Opera (String newname) {
		usuario.setName (newname);
	}
	
	void Opera (int nage) {
		usuario.setAge (nage);
		
	}
	
}
