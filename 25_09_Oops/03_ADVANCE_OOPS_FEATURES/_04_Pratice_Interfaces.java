import java.util.*;

interface PaymentGateway {

    void processPayment(double amount);

}

class CreditCardPayment implements PaymentGateway {

    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of %.2f%n", amount);
    }
}

class UPIPayment implements PaymentGateway {

    public void processPayment(double amount) {
        System.out.printf("Processing UPI payment of %.2f%n", amount);
    }
}


   
//    This is the driver code that will execute and demonstrate the functionality
//    of your abstract class `PaymentGateway` and the drived classes
//    'CreditCardPayment', 'UPIPayment'.
   
//    If the Payement Method is credit card then
//    It creates the object of class CreditCardPayment.
//    It then calls the processPayment method of the CreditCardPayment class and
//    prints th corresponding text in the method.
   
//    If the Payement Method is upi then
//    It creates the object of class UPIPayment.
//    It then calls the processPayment method of the UPIPayment class and prints th
//    corresponding text in the method.
   
   

class _04_Pratice_Interfaces {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> paymentMethods = new ArrayList<>();
        List<Double> amounts = new ArrayList<>();

        System.out.print("Enter number of payments: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter payment method (credit/upi): ");
            String method = scanner.nextLine();
            paymentMethods.add(method);

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            amounts.add(amount);
        }

        for (int j = 0; j < paymentMethods.size(); j++) {

            PaymentGateway payment = null;

            String method = paymentMethods.get(j);
            if (method.equalsIgnoreCase("credit")) {
                payment = new CreditCardPayment();
            } else if (method.equalsIgnoreCase("upi")) {
                payment = new UPIPayment();
            }

            payment.processPayment(amounts.get(j));
        }

        scanner.close();
    }
} 
 
// Below are the output statements

// System.out.printf("Processing UPI payment of %.2f%n", amount);
// System.out.printf("Processing credit card payment of %.2f%n", amount);
