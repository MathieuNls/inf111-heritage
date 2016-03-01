package collection;

/**
 * Interface pour une file, qui extends collection
 * @author Profs
 *
 */
public interface IFile extends ICollection{

	public void enfile(int element) throws Exception;
	public int defile() throws Exception;
}
