public class Date {
    int jour,mois,anne;
    public Date (int jour, int mois , int  anne ){
        this.jour =jour ;
        this.mois = mois;
        this.anne = anne;
    }

    public int getAnne() {
        return anne;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public void setAnne(int anne) {
        this.anne = anne;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }
    public  void Modifier (int jour , int mois , int anne ){
        this.jour =jour ;
        this.mois = mois;
        this.anne = anne;
    }
    public  void Comparer ( int jour1 ,int mois1 , int anne1 , int jour2 , int mois2 , int anne2 ){
        String result = (anne1  > anne2) ?  "date 1 > date 2 " : (anne1 < anne2)?  "date 2 > date 1 "
                       : (mois1 > mois2)? "date 1 > date 2 " : (mois1 < mois2)?  "date 2 > date 1"
                       : (jour1 > jour2) ?  "date 1 > date 2 "  : (jour1 < jour2 )? "date2 > date 1 "
                       : "les detes sont egeaux";
    }
    public  void Affichage (){
        System.out.println(" date : " + jour + "/" + mois + "/" + anne);
    }

}
