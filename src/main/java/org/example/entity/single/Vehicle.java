package org.example.entity.single;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@DiscriminatorValue("vehicle")
@Data
@Getter
@Setter
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer productionYear;

    private String name;
}
