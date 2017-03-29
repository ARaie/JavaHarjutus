import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RentalStore {

    private Inventory inventory;
    private List<RentalTransaction> rentalTransactions;

    public RentalStore() {
        this.inventory = new Inventory();
        this.rentalTransactions = new LinkedList<RentalTransaction>();
        generateFakeRentalTransactions();
    }

    public Inventory getInventory() {
        return inventory;
    }

    private void generateFakeRentalTransactions() {
        rentItem(new Customer("Üks"), inventory.getAllAvailableItems().get(new Random().nextInt(inventory.getAllAvailableItems().size() - 1) + 1), 1, true);
        rentItem(new Customer("Kaks"), inventory.getAllAvailableItems().get(new Random().nextInt(inventory.getAllAvailableItems().size() - 1) + 1), new Random().nextInt(30) + 1, true);
    }


    public void rentItem(Person person, Item item, int days, Boolean temsAcceptance) {
        if (item.isAvailable()) {
            RentalTransaction newRentalTransaction = new RentalTransaction(person, item, days, temsAcceptance);

            if (!rentalTransactions.contains(newRentalTransaction)) {
                rentalTransactions.add(newRentalTransaction);
            }
        }
    }


    public List<RentalTransaction> getAllRentals() {
        return rentalTransactions;
    }


    public List<RentalTransaction> getAllRentalsForCustomer(Person person) {
        List<RentalTransaction> rentalTransactionsForCustomer = new LinkedList<RentalTransaction>();
        for (RentalTransaction rentalTransaction : rentalTransactions) {
            if (rentalTransaction.getPerson().equals(person)) {
                rentalTransactionsForCustomer.add(rentalTransaction);
            }
        }
        return rentalTransactionsForCustomer;
    }

}
