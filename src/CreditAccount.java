public class CreditAccount extends Account{

    double limit = 0;

    @Override
    public boolean deposit(double _amount){
        if(_amount <= 0){
            System.out.println("Incorrent amount. Value is less than or equal to 0. ");
            return false;
        }
        if(_amount > 0){
            limit = limit - _amount;
            setBalance(getBalance() - limit);
            System.out.println("Thank you for the payment my friend. ");
            return true;
        }
        return true;
    }

    @Override
    public boolean withdraw(double _amount){
        if(_amount > 1000){
            System.out.println("You can't withdraw over your card limit. ");
            return false;
        }
        if(_amount <= 0){
            System.out.println("My friend you can't pay your card like this");
            return false;
        }
        limit = limit + _amount;
        setBalance(getBalance() + limit);
        return true;
    }

    @Override
    public String toString(){
        String content = "The current credit card balance =  " + limit + "\n";
        return content;
    }
















}
