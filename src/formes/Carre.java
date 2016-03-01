package formes;


public class Carre extends Forme{
	
	private int arrete;
	
	public Carre(int x, int y, int arrete){
		super(x, y);
		this.arrete = arrete;
	}
	
	public float aire(){
		return arrete * arrete;
	}


	public int getArrete() {
		return arrete;
	}

	public void setArrete(int arrete) {
		this.arrete = arrete;
	}

	public String toString() {
		return "Carre [origine=" + super.getOrigine() + ", arrete=" + arrete + "]";
	}
	
	

}
