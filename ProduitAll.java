public class ProduitAll extends Produit {
    Date datefab ;
    Date dateexp;
    String card ;

    public ProduitAll ( Date datefab, Date dateexp ,String card){
        super(int referance, String desg , String source, String pays , int quantite);
        this.card=card;
        this.dateexp=dateexp;
        this,datefab=datefab;
    }

    public Date getDateexp() {
        return dateexp;
    }

    public Date getDatefab() {
        return datefab;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }

    public void setDatefab(Date datefab) {
        this.datefab = datefab;
    }

    @Overriding
    public void Affichage (){
        System.out.println( "datefab = "+ datefab + " dateexp = "+ dateexp + "card = "+ card + super().ToString);
    }




}
