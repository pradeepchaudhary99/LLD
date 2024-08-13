package SolidPrinciple;


// Undertanding SRP --> single responsibility prinicple
// a class should have only one reason to change
class Marker {
    String name;
    String color;
    int price;
    int quantity;

    public Marker(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity)
    {
        this.marker = marker;
        this.quantity = quantity;
    }

    /*
    * This class is having 3 reasons to change -> its voilating the SRP
    * 1. if any change in the calculation logic
    * 2. change in the printInvoice logic
    * 3. change in the saveToDB logic.
    * */

    // how to correct: create a seperate class for each responsibilty
    public int calculateTotal()
    {
        int price = marker.price * marker.quantity;
        return price;
    }
    public int printInvoice()
    {
        //print the invoice
        return 0;
    }
    public void saveToDB()
    {
        //save the data into DB
    }

}

