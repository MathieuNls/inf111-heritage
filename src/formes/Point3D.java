package formes;
public class Point3D extends Point2D {

	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public String quiSuisJe(){
		return "Je suis un Point3D, " + super.quiSuisJe();
		
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String toString() {
		return "Point3D [x=" + 
				this.getX() + ", y=" + 
				this.getY() + ", z=" + z
				+ "]";
	}

}
