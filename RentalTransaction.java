
public class RentalTransaction {

    private static final int PREMIUM_FEE = 4;
    private static final int REGULAR_FEE = 3;

    private Person person;
    private Item item;
    private int days;
    private int price;
    private boolean termsAcceptance;

    public RentalTransaction(Person person, Item item, int days, boolean termsAcceptance) {
        this.person = person;
        this.item = item;
        this.days = days;
        this.price = calculate();
        this.termsAcceptance = termsAcceptance;
    }

    public Person getPerson() {
        return person;
    }

    public Item getItem() {
        return item;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
        this.price = calculate();
    }

    public int getPrice() {
        return price;
    }

    private int calculate() {
        switch (item.getType()) {
            case NEW_RELEASES:
                this.price = PREMIUM_FEE * days;
                break;
            case REGULAR:
                if (days > 3) {
                    this.price = REGULAR_FEE + REGULAR_FEE * (days - 3);
                } else {
                    this.price = REGULAR_FEE * days;
                }
                break;
            case OLD:
                if (days > 5) {
                    this.price = REGULAR_FEE + REGULAR_FEE * (days - 5);
                } else {
                    this.price = REGULAR_FEE * days;
                }
                break;
        }
        return this.price;
    }

    public boolean isTermsAccepted() {
        return termsAcceptance;
    }

    public void setTermsAcceptance(boolean termsAcceptance) {
        this.termsAcceptance = termsAcceptance;
    }
}