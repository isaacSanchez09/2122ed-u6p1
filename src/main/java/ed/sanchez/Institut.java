package ed.sanchez;

public class Institut {

	private static final String COGNOMS_ALUMNE = "sánchez";
	private static final String NOM_ALUMNE = "Isaac";

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = NOM_ALUMNE;
		p.cognoms = COGNOMS_ALUMNE;
		p.cicleFormatiu = "1º DAW";
		p.any = 2022;
		
		System.out.println(p.toString());

	}

}
