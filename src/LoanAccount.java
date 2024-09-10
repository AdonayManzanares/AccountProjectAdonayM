public class LoanAccount extends Account{

    double loan = 0;
    double interest = 5;

    @Override
    public boolean deposit(double _amount){
        if(_amount <= 0){
            System.out.println("Incorrect amount. Value is less than or equal to 0. ");
            return false;
        }
        if(_amount > 0){
            loan = loan - _amount;
            setBalance(getBalance() - loan);
            System.out.println("Thank you for paying your loan my friend. " + " Your current interest amount is: " + interest + "% ");
            return true;
        }
        return true;
    }

    @Override
    public boolean withdraw(double _amount){
        if(_amount > 5000){
            System.out.println("You can't withdraw over your loan limit. ");
            return false;
        }
        if(_amount <= 0){
            System.out.println("My friend you can't pay your loan like this");
            return false;
        }
        loan = loan + _amount;
        setBalance(getBalance() + loan);
        interest++;
        return true;
    }

    @Override
    public String toString(){
        String content = "The current loan balance =  " + loan + " and your interest rate is = " + interest + "% " + "\n";
        return content;
    }
















}
