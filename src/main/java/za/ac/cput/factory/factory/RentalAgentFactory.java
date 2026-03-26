package za.ac.cput.factory.factory;

import za.ac.cput.factory.domain.RentalAgent;

public class RentalAgentFactory {
    public static RentalAgent createAgent(String agentId, String name, String email, String phoneNumber) {
        // Validate input
        if(agentId == null || agentId.isEmpty()) {
            throw new IllegalArgumentException("Agent ID is required");
        }
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }
        if(email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email is required");
        }
        if(phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Phone number is required");
        }
        return RentalAgent.builder()
                .agentId(agentId)
                .name(name)
                .email(email)
                .phoneNumber(phoneNumber)
                .build();
    }
}
