package cakeproject;

public class WeddingCake extends Cake {//This will be the subclass used with wedding cake orders.

    private String groomsFirstName;
    private String bridesFirstName;

    public WeddingCake() {
    }//default constructor for WeddingCake.

    public WeddingCake(String flavor, int tiers, double price, String bridesFirstName, String groomsFirstName) {
        super(flavor, tiers, price);
        this.bridesFirstName = bridesFirstName;
        this.groomsFirstName = groomsFirstName;
    }//Sets values for WeddingCake subclass.

    @Override
    public void printCard() {
        System.out.println("Happy Wedding to " + bridesFirstName + " and " + groomsFirstName + "!");
        super.printCard();
    }//Overrides printCard from Cake parent class to make a unique message for wedding cake orders.
}
