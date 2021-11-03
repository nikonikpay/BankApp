public class BankApp {
    public static void main(String[] args) {

        Bank bank = new Bank("National Belgium Bank");
        if (bank.addBranch("Gent")){
            System.out.println(" gent branch created");

        }
        bank.addCustomer("Gent","Ali",50.5);
        bank.addCustomer("Gent","Manuel",2540.56);
        bank.addCustomer("Gent","Pearl",654.54);

        bank.addBranch("Brussel");
        bank.addCustomer("Brussel","Dunya",980.50);


        bank.addCustomerTransaction("Gent","Ali", 120.0);
        bank.addCustomerTransaction("Gent","Manuel",654.65);
        bank.addCustomerTransaction("Gent","Pearl",60.54);

        bank.listCustomers("Gent",true);
        bank.listCustomers("Brussel",true);

//        bank.addBranch("Namur");

        if (! bank.addCustomer("Namur","Judi",65.65)){
            System.out.println("namur branch does not exist");


        }
        if (!bank.addBranch("Gent")){
            System.out.println(" Gent branch Already exist");
        }



        if (!bank.addCustomerTransaction("Gent", "Nadia", 654.5)) {
            System.out.println(" This customer does not exist in that branch");

        }

        if (!bank.addCustomer("Gent", "Ali", 12.21)) {
            System.out.println("Customer Already exist");

        }

    }

}
