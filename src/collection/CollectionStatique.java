package collection;

/**
 * Collection statique pour les file et les piles
 * @author Profs
 *
 */
public abstract class CollectionStatique implements ICollection {
	
	protected int[] elements = new int[100];
	protected int elementSignificatif = 0;
	
	
	
	public boolean estVide() {
		return elementSignificatif == 0;
	}
	public boolean estPlein() {
		return elementSignificatif == elements.length;
	}

}
