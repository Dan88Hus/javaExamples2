public class Main {
    public static void main(String[] args) {
        // simple Banking application
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","Tim",50.00);
        bank.addCustomer("Adelaide","Mike",30.00);
        bank.addCustomer("Adelaide","Huseyin",150.00);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",140.00);

        bank.addCustomerTransaction("Adelaide","Tim",30);
        bank.addCustomerTransaction("Adelaide","Tim",10);
        bank.addCustomerTransaction("Adelaide","Tim",5);
        bank.addCustomerTransaction("Adelaide","Mike",3);

//        bank.listCustomers("Adelaide",false);
//        bank.listCustomers("Adelaide",true);
        bank.listCustomers("Sydney",true);
    }
}
