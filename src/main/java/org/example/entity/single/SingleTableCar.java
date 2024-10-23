package org.example.entity.single;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("car")
@Setter
@Getter
@Data
public class SingleTableCar extends Vehicle {
    private Integer seatsAmount;
}
