package za.ac.cput.factory.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.factory.domain.RentalAgent;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgentFactoryTest {

    @Test
    void testCreateRentalAgent() {
        RentalAgent agent = RentalAgent.builder()
                .agentId("XR554")
                .name("Lucky Twala")
                .email("snazolucky@gmail.com")
                .phoneNumber("0732316807")
                .build();

        assertNotNull(agent);
        assertEquals("XR554", agent.getAgentId());
        assertEquals("Lucky Twala", agent.getName());
        assertEquals("snazolucky@gmail.com", agent.getEmail());
        assertEquals("0732316807", agent.getPhoneNumber());
    }

}