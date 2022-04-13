package CardFactoryV2;

public class DebitCardCreator  extends CardCreator{
    public DebitCardCreator() {
    }

    public VisaDebit createVisa() {
        return new VisaDebit();
    }


    public MCDebit createMC() {
        return new MCDebit();
    }


}
