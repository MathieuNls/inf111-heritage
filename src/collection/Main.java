package collection;

public class Main {
	
	public static void main(String[] args){
		
		IPile p = new PileStatique();
		IPile pd = new PileDynamique(10);
		IFile f = new FileStatique();
		IFile fd = new FileDynamique(10);
		IFile fdd = new FileDouble(10);

		try {
			pd.empile(20);
			p.empile(10);
			f.enfile(10);
			fd.enfile(10);
			fdd.enfile(10);

			System.out.println(pd.depile());
			System.out.println(p.depile());
			System.out.println(f.defile());
			System.out.println(fdd.defile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
