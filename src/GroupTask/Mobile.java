package GroupTask;

public class Mobile {
        String mobileDetails;
        int numberOfItems;
        double priceOfMobilePhones;

        Mobile(String mobileDetails,int numberOfItems,double priceOfMobilePhones){
            this.mobileDetails=mobileDetails;
            this.numberOfItems=numberOfItems;
            this.priceOfMobilePhones=priceOfMobilePhones;
        }

        public double amount(){
            return priceOfMobilePhones*numberOfItems;
        }

        public double dicount(){
            return amount()*0.1;
        }

        public double VAT(){ return (amount()-dicount())*0.05; }

        public double amountToPay(){ return (int)(amount()-dicount()+ VAT()); }

        public String replaceMobileDetailes(){
            String repl;
            repl=mobileDetails.replace('a','A');
            return repl;
        }

        public String CompanyCode(){
            String code;
            code=mobileDetails.substring(0,6);

            return code;
    }
}
