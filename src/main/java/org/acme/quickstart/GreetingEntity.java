package org.acme.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class GreetingEntity extends PanacheEntityBase {

    @Id
    public UUID id;

    public String message;
}
