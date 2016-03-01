package formes;


public class TriangleRectange extends Rectangle{

	public TriangleRectange(int x, int y, int arrete, int arreteX) {
		super(x, y, arrete, arreteX);
	}
	
	public float aire(){
		return super.aire() / 2;
	}
	

}
