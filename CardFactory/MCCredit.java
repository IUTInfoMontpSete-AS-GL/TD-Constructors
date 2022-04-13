package CardFactoryV2;

 class MCCredit extends MCCard {
    protected MCCredit() {
        super();
    }

    public String test(){
        return "test";
    }

    public String toString() {
        return super.toString()+ "modele de la carte = credit " ;
    }
}
