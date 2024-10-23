package org.example.entity.single;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("motorbike")
@Getter
@Setter
@Data
public class Motorbike extends Vehicle {
    private Integer numberOfWheels;
}
