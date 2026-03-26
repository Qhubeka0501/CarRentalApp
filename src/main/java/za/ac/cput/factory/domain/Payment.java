package za.ac.cput.factory.domain;

public class Payment {
    private final String paymentId;
    private final double amount;
    private final String paymentMethod;
    private final String paymentDate;

    // Private constructor, only accessible via Builder
    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.amount = builder.amount;
        this.paymentMethod = builder.paymentMethod;
        this.paymentDate = builder.paymentDate;
    }

    // Getters
    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    // Static builder() method
    public static Builder builder() {
        return new Builder();
    }

    // Builder inner class
    public static class Builder {
        private String paymentId;
        private double amount;
        private String paymentMethod;
        private String paymentDate;

        public Builder paymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder paymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
