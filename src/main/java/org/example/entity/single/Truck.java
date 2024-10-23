package org.example.entity.single;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("truck")
@Getter
@Setter
@Data
public class Truck extends Vehicle {
    private Integer maxLoad;
}
