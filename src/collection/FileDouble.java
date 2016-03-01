package collection;

/**
 * Created by math on 3/1/16.
 */
public class FileDouble extends CollectionDynamiqueDouble implements IFile{


    public FileDouble(int element) {
        super(element);
    }


    @Override
    public void enfile(int element) throws Exception {

        MaillonDouble elem = new MaillonDouble(element);
        if(estVide()){
            tete = elem;
            //La tete est statiquement un maillon simple mais dynamiquement un maillon double
            queue = (MaillonDouble)tete;
        }else{
            queue.setSuivante(elem);
            elem.setPrecedent(queue);
            queue = elem;
        }
    }

    @Override
    public int defile() throws Exception {

        if(estVide()){
            throw new Exception("est vide");
        }

        int elem = tete.getElement();
        tete = tete.getSuivante();
        return elem;
    }
}
