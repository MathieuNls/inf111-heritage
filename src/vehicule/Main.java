package vehicule;

public class Main {
	
	public static void main(String[] args){
		
		Voiture v = new Voiture(0, 0, 2, 2, 20, 20);
		v.deplace();
		System.out.println(v);
		
		Fusee f = new Fusee(1, 2, 3, 5, 6, 7, 8, 9, 10);
		f.deplace();
		System.out.println(f);
	}

}
