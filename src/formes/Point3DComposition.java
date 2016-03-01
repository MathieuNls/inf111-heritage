package formes;

public class Point3DComposition {
	
	private Point2D point2d;
	private int z;
	
	
	public Point3DComposition(int x, int y, int z) {
		super();
		this.point2d = new Point2D(x, y);
		this.z = z;
	}
	
	public int getY(){
		return this.point2d.getY();
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	public String toString() {
		return "Point3DComposition [point2d=" + point2d + ", z=" + z + "]";
	}
	
	
	

}
