package CardFactoryV2;

public abstract class MCCard extends Card {
    protected MCCard() {
        super();
    }
    public String toString() {
        return super.toString()+ "type de la carte = masterCard " ;
    }
}
