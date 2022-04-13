package CardFactoryV2;

public  class CreditCardCreator  extends CardCreator {
    public CreditCardCreator() {
    }

    public VisaCredit createVisa() {
        return  new VisaCredit();
    }


    public MCCredit createMC() {
        return new MCCredit();
    }


}
