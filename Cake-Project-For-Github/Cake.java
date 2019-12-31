package cakeproject;

public class Cake {

    public String flavor;
    public int tiers;
    public double price;

    public Cake() {
    }//default constructor for Cake.

    public Cake(String flavor, int tiers, double prices) {
        this.flavor = flavor;
        this.tiers = tiers;
        this.price = prices;
    }//Sets values for Cake constructor, called later using super.

    public void printInvoice() {
        System.out.println("A " + tiers + " tier " + flavor + " cake. The price is $" + price + ". Issed on: " + java.time.LocalDate.now());
    }//Prints variables to be read by user.

    public void printCard() {
        System.out.println("Thank you for choosing us!");
    }//Prints message to be used in all orders and is overridden for unique messages later.
}
