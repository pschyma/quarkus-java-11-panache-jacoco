package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        GreetingEntity entity = new GreetingEntity();
        entity.id = UUID.randomUUID();
        entity.message = "hello " + name;
        entity.persist();

        return entity.message;
    }

}
