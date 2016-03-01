package collection;

/**
 * Pile statique
 * @author Profs
 *
 */
public class PileStatique extends CollectionStatique implements
 IPile{

	/**
	 * Empile un element
	 * @param element
	 */
	public void empile(int element) throws Exception {

		if(estPlein()){
			throw new Exception("Est pleine");
		}

		this.elements[elementSignificatif] = element;
		elementSignificatif++;
	}

	/**
	 * Depile un element
	 * @return
	 */
	public int depile() throws Exception {

		if(estVide()){
			throw new Exception("est vide");
		}

		int result = this.elements[elementSignificatif-1];
		elementSignificatif--;
		return result;
	}

}
