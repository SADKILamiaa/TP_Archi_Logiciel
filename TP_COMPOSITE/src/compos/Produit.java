package compos;

public class Produit extends Donnees {
	int idProd;
	String nomProd;

	public Produit(int idProd, String nomProd) {
		super();
		this.idProd = idProd;
		this.nomProd = nomProd;
		this.level = 0;
	}

	public Produit() {
		super();
	}

	@Override
	public void View() {
		// TODO Auto-generated method stub
		System.out.println(this.nomProd);

	}

}
