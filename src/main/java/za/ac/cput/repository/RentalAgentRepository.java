package za.ac.cput.repository;

import za.ac.cput.domain.RentalAgent;

import java.util.HashMap;
import java.util.*;

/*
 * Class Name: PaymentRepository
 * Description: Payment Repository class
 * Author: Lucky July Twala (231242840)
 * Date: 22 March 2026
 */


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
