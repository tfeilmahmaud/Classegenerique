package generique;

public class ClassesGenerique {

	public static void main(String[] args) {
		Pilote p = new Pilote(12, "cheikh", "nah", "NKTT", 10000);
		Avion a = new Avion(11, "chebah", 200, "NKTT");
		
		PiloteDAO pil = new PiloteDAO();
		AvionDAO av = new AvionDAO();
		VolDAO vol = new VolDAO();
		//Q1 Ajouter un pilote de votre BD
		pil.save(p);
		//Q2 Ajouter une avion de votre BD
		System.out.println("\n");
		av.save(a);
		//Q3 Augmenter  de 20% les saliares de pilote dont le slaire < X
		System.out.println("\n");
		pil.Update(p);
		//Q4 Afficher la liste des avions
		System.out.println("\n");
		System.out.println("********************* Liste de avions ************************\n");
	    av.afficherall();
	    //Q5 Afficher les vols au depart de paris
	    System.out.println("\n");
	    System.out.println("********************* Liste de vols ************************\n");
		vol.afficherall();
		System.out.println("********************* Liste de pilote MIRANDA ************************");
		System.out.println("\n");
		//Q6 Afiicher les vols du pilote MIRANDA
		pil.afficherall();
		
		
	}

	}


