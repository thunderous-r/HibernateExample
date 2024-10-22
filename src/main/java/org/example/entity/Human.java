package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="humans")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Data
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    @OneToMany
    @JoinColumn(name = "human_id")
    private List<Car> cars;
}
