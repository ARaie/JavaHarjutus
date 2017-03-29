

public class Main {

    public static void main(String[] args) {
        RentalStore rentalStore = new RentalStore();
        for (RentalTransaction rentalTransaction : rentalStore.getAllRentals()) {
            System.out.println(rentalTransaction.getItem().getTitle() + rentalTransaction.getItem().getType() +" "+ Convertor.convertToDays(rentalTransaction.getDays()) + " "+Convertor.convertToCurrency(rentalTransaction.getPrice())+" EUR");
        }
        System.out.println("----------------------------------");
        Customer boonus = new Customer("Kauri");
        System.out.print(boonus);
    }
}