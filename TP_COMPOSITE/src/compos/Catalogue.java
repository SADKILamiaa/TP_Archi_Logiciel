package compos;
import java.util.ArrayList;
import java.util.List;

public class Catalogue extends Donnees {

	int idCategorie;
	String nomCategorie;
	List<Donnees> childData;

	public Catalogue(int idCategorie, String nomCategorie) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.childData = new ArrayList<Donnees>();
		this.level = 0;
	}

	@Override
	public void View() {
		// TODO Auto-generated method stub
		System.out.println(this.nomCategorie);
		if (!childData.isEmpty()) {
			for (int i = 0; i < this.childData.size(); i++) {
				for (int j = 0; i < this.childData.get(i).level; j++) {
					System.out.println("\t");
				}
				childData.get(i).View();
			}
		}

	}

	public void add(Donnees d) {
		childData.add(d);
		for (int i = 0; i < this.childData.size(); i++) {

			childData.get(i).level = this.level + 1;
		}

	}

}
