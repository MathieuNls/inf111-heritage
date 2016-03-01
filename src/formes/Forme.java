package formes;

public abstract class Forme {
	
	private Point2D origine;
	
	public Forme(int x, int y){
		this.origine = new Point2D(x, y);
	}

	public Point2D getOrigine() {
		return origine;
	}

	public void setOrigine(Point2D origine) {
		this.origine = origine;
	}
	
	public abstract float aire();
	
}
