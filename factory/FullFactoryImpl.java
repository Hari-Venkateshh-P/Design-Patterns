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

class PaymentFactory {
    public static Payment getPaymentType(String paymentMethod) throws Exception {
        Payment payment;
        if (paymentMethod.equalsIgnoreCase("paytm")) {
            payment = new PaytmPayment();
        } else if (paymentMethod.equalsIgnoreCase("razorpay")) {
            payment = new RazorpayPayment();
        } else {
            throw new Exception(String.format("%s Payment type not supported", paymentMethod));
        }
        return payment;
    }
}

public class FullFactoryImpl {
    public static void main(String[] args) throws Exception {
        String paymentMethod = "paytm";
        Payment payment = PaymentFactory.getPaymentType(paymentMethod);
        payment.doPayment();
    }
}

// Client Main Method no longer creates object what kind of Payment object do we
// need.
// Payment Factory returns what kind of Payment object do we need.
// Still Violates open/closed principle.