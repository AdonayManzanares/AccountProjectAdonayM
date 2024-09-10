//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DebitAccount dbt1 = new DebitAccount();
        DebitAccount dbt2 = new DebitAccount(25);
        CreditAccount cdt1 = new CreditAccount();
        LoanAccount ldt1 = new LoanAccount();


        dbt1.deposit(100);
        System.out.println(dbt1.toString());

        dbt2.deposit(100);
        System.out.println(dbt2.toString());

        cdt1.withdraw(100);
        System.out.println(cdt1.toString());
        cdt1.withdraw(900);
        System.out.println(cdt1.toString());
        cdt1.deposit(500);
        System.out.println(cdt1.toString());

        ldt1.withdraw(5000);
        System.out.println(ldt1.toString());
        ldt1.deposit(200);
        System.out.println(ldt1.toString());
        ldt1.deposit(800);
        System.out.println(ldt1.toString());
        ldt1.withdraw(200);
        System.out.println(ldt1.toString());



    }
}