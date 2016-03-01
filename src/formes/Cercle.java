package formes;

public class Cercle extends Forme{
	
	private int rayon;

	public Cercle(int x, int y, int rayon) {
		super(x, y);
		this.rayon = rayon;
	}

	public float aire() {
		return (float) (3.14*rayon*rayon);
	}

}
