package org.acme.quickstart;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class GreetingServiceTest {

    @Test
    @Transactional
    public void testGreetingService() {
        GreetingService service = new GreetingService();
        Assertions.assertEquals("hello Quarkus", service.greeting("Quarkus"));
    }
}
