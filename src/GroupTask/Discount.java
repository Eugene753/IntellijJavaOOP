package GroupTask;

public class Discount {

    String phoneModel;
    int numOfItems;
    double price;

    Discount(String phoneModel, int numOfItems, double price) {
        this.phoneModel = phoneModel;
        this.numOfItems = numOfItems;
        this.price = price;
    }

    double amount() {
        return price * numOfItems;
    }

    double discount() {
        return 5.0/100.0 * amount();
    }

    double vat( ) {
        return 5.0/100.0 * (amount() - discount());
    }

    double total() {
        return (amount() - discount()) + vat();
    }

    //returns company code
    String companyCode(String s) {
        String[] str = s.split(" ");
        return str[0];
    }

}
