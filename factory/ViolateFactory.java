package factory;

interface Payment {
    public void doPayment();
}

class PaytmPayment implements Payment {
    public void doPayment() {
        System.out.println("Payment via Paytm");
    }
}

class RazorpayPayment implements Payment {
    public void doPayment() {
        System.out.println("Payment via Razorpay");
    }
}

public class ViolateFactory {
    public static void main(String[] args) throws Exception {
        String paymentMethod = "stripe";
        Payment payment;
        if(paymentMethod.equalsIgnoreCase("paytm")) {
            payment = new PaytmPayment();
        } else if (paymentMethod.equalsIgnoreCase("razorpay")) {
            payment = new RazorpayPayment();
        } else {
            throw new Exception(String.format("%s Payment type not supported", paymentMethod));
        }
        payment.doPayment();
    }
}


// Client Main Method creates object what kind of Payment object do we need.
// Violates open/closed principle.