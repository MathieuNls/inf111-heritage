package collection;

public class FileDynamique extends CollectionDynamique implements IFile{

	public FileDynamique(int element) {
		super(element);
	}

	/**
	 * Enfile un nvl element
	 * @param element
	 * @throws Exception
     */
	public void enfile(int element) throws Exception{

		Maillon elem = new Maillon(element);

		if(!estVide()){
			Maillon m = tete;
			while(m.getSuivante() != null){
				m = m.getSuivante();
			}
			m.setSuivante(elem);
		}else{
			tete = elem;
		}
	}

	/**
	 * Defile un element
	 * @return
	 * @throws Exception
     */
	public int defile() throws Exception {
		if(estVide()){
			throw new Exception("File Pleine");
		}

		int retour = tete.getElement();
		tete = tete.getSuivante();
		return retour;
	}

}
