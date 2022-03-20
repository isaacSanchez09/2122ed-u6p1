package ed.sanchez;

public class Persona {
	
	
	public String n;
	public String c;
	public int a;
	public String cl;
	
	@Override
	public String toString() {
		
		return  "n = " + n + System.lineSeparator() +
				"c = " + c + System.lineSeparator() +
				"a = " + a + System.lineSeparator() +
				"cl = " + cl;
				
		
	}

}
