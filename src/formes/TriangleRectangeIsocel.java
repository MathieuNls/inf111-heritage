package formes;

public class TriangleRectangeIsocel extends Carre{
	

	public TriangleRectangeIsocel(int x, int y, int arrete) {
		super(x, y, arrete);
	}
	
	public void aMoi(){
		System.out.println("TriangleRectangeIsocel");
	}
	
	public float aire(){
		return super.aire() / 2;
	}

	
}
