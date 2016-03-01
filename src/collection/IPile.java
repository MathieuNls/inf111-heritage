package collection;

/**
 * Interface pour les piles qui etends collection
 * @author Profs
 *
 */
public interface IPile extends ICollection {
	
	public void empile(int element) throws Exception;
	public int depile() throws Exception;

}
