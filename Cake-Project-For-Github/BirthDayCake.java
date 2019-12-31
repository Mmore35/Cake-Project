package cakeproject;

public class BirthDayCake extends Cake {

    private String firstName;
    private int age;

    public BirthDayCake() {
    }//Default constructor for BirthDayCake.

    public BirthDayCake(String flavor, int tiers, double price, String firstName, int age) {
        super(flavor, tiers, price);
        this.firstName = firstName;
        this.age = age;
    }//Initilizes all variables for birthday cake orders.

    @Override
    public void printCard() {
        System.out.println("Happy Birthday to " + firstName + "! You Just turned " + age + " :)");
        super.printCard();
    }//Overrides printCard from Cake parent class to make a unique message for birthday cake orders.
}
