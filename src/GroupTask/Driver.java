package GroupTask;

public class Driver {

    String DriverID;
    int PetrolAllowance;
    int DaysWorked;
    double DailyRate;

    Driver(){
        System.out.println("Driver Weekly Wage");
    }

    Driver(String DriverID,int PetrolAllowance,int DaysWorked,double DailyRate){
        this();
        this.DriverID=DriverID;
        this.PetrolAllowance=PetrolAllowance;
        this.DaysWorked=DaysWorked;
        this.DailyRate=DailyRate;
    }

    public double fuelCost(){
        double fuelCost;
        fuelCost = PetrolAllowance * 0.8;

        return fuelCost;
    }

    public double weeklyWage(){
        double extraPay;
        double totalWeeklyWage;

        extraPay=(DaysWorked-7)*2.0*DailyRate;

        totalWeeklyWage=DaysWorked*DailyRate+extraPay;

        return totalWeeklyWage;
    }

    public double monthlyWage(double monthlyAllowance){
        double totalMonthlyWage;
        int Tax;
        if(monthlyAllowance>2000){
            Tax=100;
        }else{
            Tax=50;
        }
        totalMonthlyWage=monthlyAllowance+PetrolAllowance-Tax;

        return totalMonthlyWage;
    }
}
