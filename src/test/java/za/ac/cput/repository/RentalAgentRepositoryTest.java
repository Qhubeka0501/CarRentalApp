package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.factory.domain.RentalAgent;
import za.ac.cput.factory.repository.RentalAgentRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgentRepositoryTest {

    private RentalAgentRepository repository;
    private RentalAgent agent;

    @BeforeEach
    void setUp() {
        repository = new RentalAgentRepository();
        agent = new RentalAgent.Builder()
                .agentId("XR554")
                .name("Lucky Twala")
                .email("snazolucky@gmail.com")
                .phoneNumber("0732316807")
                .build();
        repository.save(agent);
    }

    @Test
    void saveAgent() {
        RentalAgent newAgent = new RentalAgent.Builder()
                .agentId("XR555")
                .name("Wendy Hillary")
                .email("wendy23@gmail.com")
                .phoneNumber("0722773288")
                .build();
        repository.save(newAgent);
        assertEquals(2, repository.getAll().size());
    }

    @Test
    void findAgentById() {
        RentalAgent found = repository.findById("XR554");
        assertNotNull(found);
        assertEquals("XR554", found.getAgentId());
    }

    @Test
    void getAllAgents() {
        List<RentalAgent> allAgents = repository.getAll();
        assertEquals(1, allAgents.size());
    }

    @Test
    void deleteAgent() {
        repository.delete("XR554");
        assertNull(repository.findById("XR554"));
        assertEquals(0, repository.getAll().size());
    }
}
