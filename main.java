public class main {
    public static void main(String[] args) {
        ATMApplication atmApplication= new ATMApplication();
        CustomerDetails customerDetails = new CustomerDetails("Anil","345678","ABCD123","suryapet");
        System.out.println(atmApplication.apply(customerDetails));
        System.out.println(customerDetails);
    }
}
