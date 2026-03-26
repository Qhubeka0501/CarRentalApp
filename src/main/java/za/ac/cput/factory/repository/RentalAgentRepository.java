package za.ac.cput.factory.repository;

import za.ac.cput.factory.domain.RentalAgent;

import java.util.HashMap;
import java.util.*;

public class RentalAgentRepository {
    // Simulate data persistence
    private Map<String, RentalAgent> agentMap = new HashMap<>();

    // Save a new RentalAgent
    public RentalAgent save(RentalAgent rentalAgent) {
        agentMap.put(rentalAgent.getAgentId(), rentalAgent);
        return rentalAgent;
    }

    // Find a RentalAgent by ID
    public RentalAgent findById(String agentId) {

        return agentMap.get(agentId);
    }

    // Get all RentalAgents
    public List<RentalAgent> getAll() {

        return new ArrayList<>(agentMap.values());
    }

    // Delete a RentalAgent by ID
    public boolean delete(String agentId) {

        return agentMap.remove(agentId) != null;
    }
}
