package formes;

public class Rectangle extends Carre{
	
	private int arreteX;
	
	public Rectangle(int x, int y, int arrete,
			int arreteX) {
		super(x, y, arrete);
		this.arreteX = arreteX;
	}
	
	public float aire(){
		return this.getArrete() * this.arreteX;
	}

	
	
	

}
