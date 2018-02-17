public class MotsCroises{
	private Grille solution;
	private Grille proposition;
	private Grille horizontal;
	private Grille vertical;
	private int hauteur;
	private int largeur;


// constructeurs

public MotsCroises(int hauteur, int largeur){
	this.solution = new Grille(hauteur, largeur);
	this.proposition = new Grille(hauteur, largeur);
	this.horizontal = new Grille(hauteur, largeur);
	this.vertical = new Grille(hauteur, largeur);
	this.hauteur = hauteur;
	this.largeur = largeur;
}


/*
public MotsCroises(Grille solution, Grille proposition, Grille horizontal, Grille vertical) {
	super();
	this.solution = solution;
	this.proposition = proposition;
	this.horizontal = horizontal;
	this.vertical = vertical;
}


public MotsCroises(Grille solution, Grille proposition) {
	super();
	this.solution = solution;
	this.proposition = proposition;
}
*/

// Nombre de rangees

public int getHauteur(){
	return this.hauteur;
}
//Nombre de colonnes
public int getLargeur(){
	return this.largeur;
	
}

// Accesseurs aux cases noires
public boolean estCaseNoire(int lig, int col){
	boolean result= solution.getCellule(lig, col)==null;
	return result;
}
public void setCaseNoire(int lig, int col){
	this.proposition.setCellule(lig, col, null);
	this.solution.setCellule(lig, col, null);
	this.vertical.setCellule(lig, col, null);
	this.horizontal.setCellule(lig, col, null);
	
}

// Accesseurs à la grille de solution
public char getSolution(int lig, int col){
	return this.solution.getCellule(lig, col).charAt(0);
	
}
public void setSolution(int lig, int col, char sol){
	if (!this.estCaseNoire(lig, col)){
		this.solution.setCellule(lig, col, String.valueOf(sol));
	}
}
// Fin accesseur a la grille solution
// Accesseurs à la grille du joueur

public char getProposition(int lig, int col){
	return this.proposition.getCellule(lig, col).charAt(0);
}
	/*String Case="";
	if ((lig>=1 && lig<haut) && (col>=1 && col<larg)){
		
		for (int i=0; i<larg; i++){
			col=i+1;
			for (int j=0; j<haut; j++){
		lig=j+1;
	 Case=proposition.tab[lig][col];
	 System.out.println("le contenu de la grille solution ("+lig+","+col+") est "+getProposition(lig,col));
				}
	}
}
	 return Case.charAt(0);
}*/
public void setProposition(int lig, int col, char prop){
	if (!this.estCaseNoire(lig, col) && prop==0){
		this.solution.setCellule(lig, col, String.valueOf(prop));}
	else{proposition.setCellule(lig, col, " ");}
		}

// fin accesseurs a la grille du joueur 
// Accesseurs aux definitions.
public String getDefinition(int lig, int col, boolean horiz){
	return null ;
}
public void setDefinition(int lig, int col, boolean horiz, String def){
	
}
}