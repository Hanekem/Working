package main;

import java.util.*;

//basic idea here is to make operation an abstract class, and let the children deal with the particular operation
public abstract class Operation {
	protected User usuario; //just as a set up, it will be used by the child clases
	LinkedList  <User> users = new LinkedList  <User>();

	
	public void Opera () {};

}
