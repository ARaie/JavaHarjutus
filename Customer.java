
public class Customer extends Person implements BonusChargable {
    private int bonus;

    public Customer(String name) {
        super(name);
        this.bonus = 0;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void chargeBonus(Type type) {
        switch (type) {
            case NEW_RELEASES:
                this.bonus += BONUS_POINTS_FOR_NEW_RELEASE;
                break;
            default:
                this.bonus += BONUS_POINTS_FOR_OTHER;
                break;
        }
    }

    public void dischargeBonus() {
        if (this.bonus >= 25)
            this.bonus -= BONUS_CHARGE_FOR_RENT;
        else
            System.out.println("Cannot discharge bonus points for rent");
    }
}