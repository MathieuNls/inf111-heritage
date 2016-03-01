package collection;

/**
 * Collection dynamique pour les files et les piles
 * @author Profs
 *
 */
public abstract class CollectionDynamique implements ICollection {

	protected Maillon tete;

	/**
	 * Constructeur pour les collection dynamiques
	 * @param element
     */
	public CollectionDynamique(int element){
		this.tete = new Maillon(element);
	}

	/**
	 * Check si la tete est nulle
	 * @return estVide
     */
	public boolean estVide(){
		return this.tete == null;
	}

	/**
	 * Une collection dynamique est pleine si la memoire est pleine
	 * @return
     */
	public boolean estPlein(){
		return false;
	}
	
	/**
	 * Classe interne maillon simples
	 * @author Profs
	 *
	 */
	class Maillon{
		
		private Maillon suivante;
		private int element;

        /**
         * Constructeur pour un maillon simple
         * @param element
         */
		public Maillon(int element){
			this.element = element;
		}
		
		public Maillon getSuivante() {
			return suivante;
		}
		public void setSuivante(Maillon suivante) {
			this.suivante = suivante;
		}
		public int getElement() {
			return element;
		}
		public void setElement(int element) {
			this.element = element;
		}
	}
}
