package vehicule;

public abstract class VehiculeVolant extends Vehicule{
	
	private float accZ;
	private float vitesseZ;
	private float ptZ;

	public VehiculeVolant(float ptX, 
			float ptY, float ptZ, float accX, float accY,
			float accZ,
			float vitesseX, float vitesseY, float vitesseZ) {
		super(ptX, ptY, accX, accY, vitesseX, vitesseY);
		this.accZ = accZ;
		this.ptZ = ptZ;
		this.vitesseZ = vitesseZ;
	}
	
	
	public void deplace() {
		this.setPtX(this.getPtX() + 
				this.getVitesseX()*this.getAccX());
		this.setPtY(this.getPtY() + 
				this.getVitesseY()*this.getAccY());
		this.ptZ = this.ptZ + this.vitesseZ * this.accZ;
	}

	public String toString() {
		return super.toString() + " VehiculeVolant [accZ=" + accZ + ", vitesseZ=" + vitesseZ
				+ ", ptZ=" + ptZ + "]";
	}

	
	
}
