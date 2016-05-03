
public class Day2Example3Main {

	public static void main(String[] args) {
		//Working with methods
		
		System.out.println("This program was written by Gilberto");
		HelloWorld();
		System.out.println("This is day 2 of the course");
		HelloWorld();
		String name1= "Nick", name2= "Samson", name3= "Bertie";
		helloName("Gilberto");
		helloName(name1);
		//its making a kind of library where name1= Nick, name2= samson, name3= bertie
		// so it will be helloname(name1) = helloname (nick)
		//Hello Nick
		//it  makes some kind of library where you can stock chunks of codes using public static
		helloName(name2);
		helloName(name3);
		helloGuys("Bertie" , "Nick ");
		helloGuys( name2 , name3 );
		helloGuys( name2 , name1 );
		
		
		
	

	}

	//This method has no parameters
	//it takes in no values
	
	public static void HelloWorld(){
		System.out.println("Hello World");
		
	
}
	//this method takes in a string
	
	public static void helloName( String n){
		
		System.out.println("Hello " + n );
		//local variable called "n" so when the program is reading it..instead of hello+n it will be hello "name entered"
		
	}
	
	// This method takes in two strings
	public static void helloGuys ( String name1, String name2){
		System.out.println("Hello " + name1 + " and " + name2);
		
	}
	public static int AddNumbers(int x, int y){
		//declare a local variable
		 int result = x + y;
		 return result;
		 
		 //result must be an integer or it won`t work.
		 
		
	}
	
	
	
	
}

