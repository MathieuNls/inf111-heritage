package collection;

/**
 * File statique
 * @author Profs
 *
 */
public class FileStatique extends CollectionStatique 
	implements IFile{

	/**
	 * Enfile un nvl element
	 * @param element
	 * @throws Exception
	 */
	public void enfile(int element) throws Exception {

		if(estPlein()){
			throw new Exception("est pleine");
		}else{
			this.elements[elementSignificatif] = element;
			this.elementSignificatif++;
		}
	}

	public int defile() throws Exception {

		if(estVide()){
			throw new Exception("est vide");
		}
		
		int result = this.elements[0];
		for (int i = 1; i < elements.length; i++) {
			elements[i-1] = elements[i];
		}
		return result;
	}
	
	

}
