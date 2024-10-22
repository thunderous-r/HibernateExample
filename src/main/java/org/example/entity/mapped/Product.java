package org.example.entity.mapped;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "product")
public class Product extends BaseEntity {

    private String name;

    private Integer price;
}
