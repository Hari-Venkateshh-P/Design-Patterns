package factory;

import java.util.HashMap;
import java.util.Map;

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
    private static final Map<String, Payment> paymentTypeMap = new HashMap<>();

    static {
        registerPayment("PAYTM", new PaytmPayment());
    }

    public static void registerPayment(String name, Payment payment) {
        paymentTypeMap.put(name.toUpperCase(), payment);
    }

    public static Payment getPaymentType(String name) {
        Payment payment = paymentTypeMap.get(name.toUpperCase());
        if (payment == null) throw new IllegalArgumentException("Unknown payment: " + name);
        return payment;
    }
}

public class BasicFactoryImpl {
    public static void main(String[] args) throws Exception {
        PaymentFactory.registerPayment("razorpay", new RazorpayPayment());
        String paymentMethod = "razorpay1";
        Payment payment = PaymentFactory.getPaymentType(paymentMethod);
        payment.doPayment();
    }
}

// Client Main Method no longer creates object what kind of Payment object do we need.