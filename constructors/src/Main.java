public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.witdrawal(100);
        bobsAccount.deposit(50.0);
        bobsAccount.witdrawal(100);
        bobsAccount.deposit(55.0);
        bobsAccount.witdrawal(100);

        Account bobsAccountWC = new Account("12345",150.0,"BOBWC","bob@gmail.com","05331234567");



    }
}


