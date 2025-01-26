public class CCBalance {
    //Declare variables
    double creditCardBalance = 5000.00;
    double monthlyInterest = 0.17;
    double oneMonthBalance;
    double twoMonthBalance;
    public void getCCBalance(){

        //Get Credit Card Balance
        oneMonthBalance = creditCardBalance * monthlyInterest;
        creditCardBalance = creditCardBalance + oneMonthBalance;
        twoMonthBalance = creditCardBalance * monthlyInterest;
        creditCardBalance = creditCardBalance + twoMonthBalance;

        //Display Output
        System.out.println("The interest due after one month is $" + oneMonthBalance + " and the balance due after two months is $" + twoMonthBalance + ".");

        }

    }
