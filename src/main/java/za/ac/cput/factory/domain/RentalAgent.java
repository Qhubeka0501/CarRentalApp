package za.ac.cput.factory.domain;

public class RentalAgent {
    private final String agentId;
    private final String name;
    private final String email;
    private final String phoneNumber;

    // Private constructor, only accessible via Builder
    private RentalAgent(Builder builder) {
        this.agentId = builder.agentId;
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }

    // Getters
    public String getAgentId() {
        return agentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Static builder() method
    public static Builder builder() {
        return new Builder();
    }

    // Builder inner class
    public static class Builder {
        private String agentId;
        private String name;
        private String email;
        private String phoneNumber;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public RentalAgent build() {
            return new RentalAgent(this);
        }
    }
}

