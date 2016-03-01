package collection;

/**
 * Pile dynamique
 * @author Profs
 *
 */
public class PileDynamique extends CollectionDynamique 
implements IPile{

	public PileDynamique(int element) {
		super(element);
	}

	/**
	 * Empile un element
	 * @param element
     */
	public void empile(int element) throws Exception{
		
		Maillon m = new Maillon(element);
		
		m.setSuivante(tete);
		tete = m;
	}

	/**
	 * Depile un element
	 * @return
     */
	public int depile() throws Exception {

		if(estVide()){
			throw new Exception("Pile vide");
		}
		
		int element = tete.getElement();
		tete = tete.getSuivante();
		return element;
	}
}
