package philo;

public class Main {
	
	public static void main(String[] arg){
		
		Homme h = new Homme("Mathieu");
		h.mourir();
		
		Philosophe p = new Philosophe("Socrate");
		p.philosopher();
		p.mourir();
		
		Homme socrate = new Philosophe("socrate");
		
	}

}
