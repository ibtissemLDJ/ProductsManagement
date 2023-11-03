public class ProduitVes  extends Produit{
    String matiere ;
    String couleur ;
    int nbp;

    public  ProduitVes (String matiere, String couleur ,int nbp ){
        super(int referance, String desg , String source, String pays , int quantite);
        this.matiere=matiere;
        this.couleur=couleur;
        this.nbp=nbp;

    }

    public int getNbp() {
        return nbp;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setNbp(int nbp) {
        this.nbp = nbp;
    }
    @Overriding
    public  void Affichage (){
        System.out.println("matirer = "+ matiere+ "couleur = "+ couleur+ "nbp = "+ nbp+ super().ToString );
    }
}
