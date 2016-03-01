package vehicule;

public abstract class VehiculeTerrestre extends Vehicule {
	
	public VehiculeTerrestre(int ptX, int ptY, float accX, float accY,
			float vitesseX, float vitesseY) {
		super(ptX, ptY, accX, accY, vitesseX, vitesseY);
	}

	public void deplace() {
		this.setPtX(this.getPtX() + 
				this.getVitesseX()*this.getAccX());
		this.setPtY(this.getPtY() + 
				this.getVitesseY()*this.getAccY());
	}

}
