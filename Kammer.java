
public class Kammer {
	public static void main(String [] args) {
		
		Tafel tafel = new Tafel();
		Winkel Ikea = new Winkel();
		
		System.out.println( tafel.poten );
		
		Ikea.repareren( tafel );
		System.out.println( tafel.poten );
	}
}

class Winkel{
	
	void repareren(Tafel deTafel) {
		deTafel.poten += 3;
		System.out.println("repareren is gelukt");
	}
	
	static Tafel verkopen(int geld) {
		Tafel verkochteTafel = new Tafel();
		System.out.println("U heeft een tafel gekocht");
		return verkochteTafel;
		
	}
}


class Tafel {
	String kleur = "bruin";
	String stof;
	int poten = 1;
	
	void opstarten() {
		System.out.println("De tafel met de kleur " + kleur + " Hoppa");
		
		
	}
	
	
	
	
}
