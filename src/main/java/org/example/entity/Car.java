package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="cars")
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer year;
    @ManyToOne
    @ToString.Exclude
    private Human human;
}
