package com.example.sweetshop.sweets;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
//@EqualsAndHashCode(callSuper = true)
@Table
public class Sweet {
    @GeneratedValue
    @Id
    Integer id;

    @Column(
            nullable = false,
            unique = true
    )
    @JsonProperty("sweetname")
    String sweetName;

    @Column(
            nullable = false
    )
    @JsonProperty("category")
    String category;

    @Column(
            nullable = false
    )
    @JsonProperty("price")
    Double price;

    @Column(
            nullable = false
    )
    @JsonProperty("quantity")
    Integer quantity;
}
