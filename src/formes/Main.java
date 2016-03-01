package formes;

public class Main {

	public static void main(String[] args){
		Point2D pt2d = new Point2D(10, 20);
		

		Point3DComposition point3dComposition = 
				new Point3DComposition(10, 20, 30);
		

		Point3D point3d = new Point3D(10, 20, 30);

		
		point3d.setX(25);
		
		Point4D ptPoint4d = new Point4D(10, 20, 30, 40);
		
		Carre carre = new Carre(10, 10, 25);
		TriangleRectangeIsocel triange = new TriangleRectangeIsocel(20, 20, 25);
		Rectangle rectange = new Rectangle(10, 20, 30, 40);
		TriangleRectange triangle2 = new TriangleRectange(10, 20, 30, 40);
		

		System.out.println(triangle2.getOrigine());
		
		TriangleRectangeIsocel tri = 
				new TriangleRectangeIsocel(10, 20, 30);
	
		
		Carre unCarre = 
				new TriangleRectangeIsocel(10, 20, 30);
		
		Carre carre2 = 
				new Carre(10, 20, 30);
		
		Cercle cercle = new Cercle(10, 20, 30);
		
		imprimeLAire(carre2);
		imprimeLAire(cercle);
		imprimeLAire(rectange);
		
	}

	public static void imprimeLAire(Forme forme){
		System.out.println(forme.aire());
	}
	

	
}
