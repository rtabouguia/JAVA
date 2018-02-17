
public class Grille  {

	
	// variable 
	private int hauteur;
	private int largeur; 
	private String [] [] tab;
		
	
	//constructeurs
	public Grille(int h, int l){
		hauteur=h;
		largeur=l;
		tab= new String [hauteur] [largeur];
	}
	
		//accesseurs
	
	public int getHauteur() {
		return hauteur;
	}//fin public int getHauteur
	
	public int getLargeur() {
		return largeur;
	}// fin getLargeur
	
		
		//modificateurs
	

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}//fin setHauteur
	
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	} //fin setLargeur
	// valeur de la cellule(lig, col)
	
	
	public String getCellule(int lig, int col) {
		String cellule=null;
		if ((lig>=1 && lig<getHauteur()) && (col>=1 && col<getLargeur())){
		cellule=tab[lig][col];}
		return cellule;
	}

	public void setCellule(int lig, int col,String ch) {
		if ((lig>=1 && lig<getHauteur()) && (col>=1 && col<getLargeur())){
		tab[lig][col]= ch;}
	}


	
}// fin public class Grille 


	
	
