package CardFactoryV2;

public abstract class Card {

    private String numeroCarte;


    public Card() {
        this.numeroCarte = Singleton.getInstance().updateAndGetID();

    }

    @Override
    public String toString() {
        return "Card{" +
                "numeroCarte='" + numeroCarte + '\'' +
                '}';
    }
}
