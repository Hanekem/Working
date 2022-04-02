package main;

public class Alta extends Operation{

	public int ID; //for this I am assuming Id is going to be a numerical value, 
					//Class must get the operation from the generator method or from the db
	
	public void Opera(User usu) {
		User usuario = users.peekLast(); //this is just to get both an object of the class for the check first and the ID to 
		if (usuario == null) {
			usu.setIdent(1); // first item gets ID #1
			users.add(usu);
			}
		else {		
			usu.setId(usuario.getIdent()+1);// since id aren't repeatable, this is the easiest solution
			users.add(usu);
		}
	}
}
