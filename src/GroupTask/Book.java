package GroupTask;

public class Book {

    String name;
    int mobileNumber;
    int numberOfDays;
    int costPerDay;

    Book(){
        System.out.println("Welcome to Radisson Blu Hotel");
    }

    Book(String name,int mobileNumber,int numberOfDays,int costPerDay){
        this();
        this.name=name;
        this.mobileNumber=mobileNumber;
        this.numberOfDays=numberOfDays;
        this.costPerDay=costPerDay;
    }

    public double serviceCharge(){
        return costPerDay*0.1;
    }

    public void totalCost(){
        double foodCost=(numberOfDays*10)-3;
        double totalCost=(numberOfDays*costPerDay)+foodCost;
        System.out.println("Total cost for individual including food = "+totalCost);
    }

    public void totalCost(int numberOfPerson){
    double VAT;
        if(numberOfPerson>=2){
            VAT=0.2;
        }else{
            VAT=0.1;
        }
        double discount=numberOfDays*costPerDay*VAT;
        double totalCost=numberOfDays*costPerDay-discount;
        System.out.println("Total cost individual without food = "+totalCost);
    }
}
