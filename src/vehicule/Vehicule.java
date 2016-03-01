package vehicule;

public abstract class Vehicule {
	
	private float ptX;
	private float ptY;
	private float accX;
	private float accY;
	private float vitesseX;
	private float vitesseY;

	public Vehicule(float ptX, float ptY, float accX, float accY, float vitesseX,
			float vitesseY) {
		super();
		this.ptX = ptX;
		this.ptY = ptY;
		this.accX = accX;
		this.accY = accY;
		this.vitesseX = vitesseX;
		this.vitesseY = vitesseY;
	}
	
	public abstract void deplace();
	
	public String toString() {
		return "Vehicule [ptX=" + ptX + ", ptY=" + ptY + ", accX=" + accX
				+ ", accY=" + accY + ", vitesseX=" + vitesseX + ", vitesseY="
				+ vitesseY + "]";
	}
	public float getPtX() {
		return ptX;
	}
	public void setPtX(float ptX) {
		this.ptX = ptX;
	}
	public float getPtY() {
		return ptY;
	}
	public void setPtY(float ptY) {
		this.ptY = ptY;
	}
	public float getAccX() {
		return accX;
	}
	public void setAccX(float accX) {
		this.accX = accX;
	}
	public float getAccY() {
		return accY;
	}
	public void setAccY(float accY) {
		this.accY = accY;
	}
	public float getVitesseX() {
		return vitesseX;
	}
	public void setVitesseX(float vitesseX) {
		this.vitesseX = vitesseX;
	}
	public float getVitesseY() {
		return vitesseY;
	}
	public void setVitesseY(float vitesseY) {
		this.vitesseY = vitesseY;
	}
	
	

}
