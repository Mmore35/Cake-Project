package cakeproject;

public class CakeProject {

    public static void main(String[] args) {
        WeddingCake wedCk = new WeddingCake("chocolate", 3, 355.0, "Sarah", "John");
        wedCk.printInvoice();
        wedCk.printCard();

        System.out.println();

        BirthDayCake bdCk = new BirthDayCake("vanilla", 1, 20.0, "Alan", 15);
        bdCk.printInvoice();
        bdCk.printCard();
    }//Main program calling other classes.

}
