package compos;

public class Princip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produit p1 = new Produit(1, "P1");
		Catalogue c1 = new Catalogue(1, "C1");
		Catalogue c2 = new Catalogue(1, "C2");
		Catalogue c3 = new Catalogue(1, "C3");
		Catalogue c4 = new Catalogue(1, "C4");

		c1.add(p1);
		c1.add(c2);
		c1.add(c3);
		c1.add(c4);

		c1.View();

	}

}
