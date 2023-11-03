public class Produit {
    int referance ;
    String desg ,source ,pays ;
    int quantite ;
    public Produit ( int referance, String desg , String source, String pays , int quantite ){
        this.desg=desg;
        this.referance=referance;
        this.pays=pays;
        this.source=source;
        this.quantite=quantite;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setReferance(int referance) {
        this.referance = referance;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getReferance() {
        return referance;
    }

    public String getDesg() {
        return desg;
    }

    public String getPays() {
        return pays;
    }

    public String getSource() {
        return source;
    }

    public void Achat (int nombreProduitA ){
        quantite += nombreProduitA;
    }
    public void Vente (int nombreProduitV ){
        quantite -= nombreProduitV;
    }
    public void Afficher (){
        System.out.println("referance = "+ referance+"designation ="+ desg+ "pays = "+ pays + " source = "+ source + "quantite = "+ quantite);
    }
}
