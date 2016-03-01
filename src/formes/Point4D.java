package formes;

public class Point4D extends Point3D {
	
	private int alpha;

	public Point4D(int x, int y, int z, int alpha){
		super(x, y, z);
		this.alpha = alpha;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}
	
	public String quiSuisJe(){
		
		return "Je suis un Point4D, " + super.quiSuisJe();
	}

	public String toString() {
		
		return "Point4D [x=" + 
				this.getX() + ", y=" + 
				this.getY() + ", z=" + this.getZ()
				+ " ; alpha="+alpha
				+ "]";
	}
	
	
	
}
