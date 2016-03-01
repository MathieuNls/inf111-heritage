package collection;

/**
 * Collection dynamique double
 */
public abstract class CollectionDynamiqueDouble extends CollectionDynamique{

	protected MaillonDouble queue;

	/**
	 * Constructeur
	 * @param element
     */
	public CollectionDynamiqueDouble(int element) {
		super(element);

		//Ici, on remplace la tete par un maillon double. MaillonDouble est une specialisation
		//de maillon. Donc pas de soucis de type
		this.tete = new MaillonDouble(element);
		this.queue = (MaillonDouble)tete;
	}

	/**
	 * Classe interne MaillonDouble
	 */
	class MaillonDouble extends Maillon{
		
		private MaillonDouble precedent;
		
		public MaillonDouble(int element){
			super(element);
		}

		public MaillonDouble getPrecedent() {
			return precedent;
		}

		public void setPrecedent(MaillonDouble precedent) {
			this.precedent = precedent;
		}
	}

}
