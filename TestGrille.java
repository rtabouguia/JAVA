
public class TestGrille {

	public static void main(String[] args) {
		
//initialisation
		Grille G1;
		int lig=0;
		int col=0;
		int h=0;
		int l=0;
//l'objet G1
		l=10;
		h=12;
		lig=1;
		col=6;
		G1=new Grille(l,h);
		G1.setCellule(lig,col,"Bonjour");
		System.out.println("hauteur du tableau:"+G1.getHauteur());
		System.out.println("largeur du tableau:"+G1.getLargeur());
		System.out.println("le contenu de la cellule ("+lig+","+col+") est "+G1.getCellule(1,1));
		
		for (int i=0; i<l; i++){col=i+1;
			for (int j=0; j<h; j++){
				lig=j+1;
			System.out.println("le contenu de la cellule ("+lig+","+col+") est "+G1.getCellule(lig,col));
				}
			
		}
			
		
	}

}
