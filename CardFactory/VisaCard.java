package CardFactoryV2;

public abstract class VisaCard extends Card {

    protected VisaCard() {
        super();
    }
    public String toString() {
        return super.toString()+ "type de la carte = visaCard " ;
    }
}
