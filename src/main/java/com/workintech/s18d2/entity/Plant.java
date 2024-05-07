package com.workintech.s18d2.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.workintech.s18d2.dto.FruitResponse;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class Plant {


    @org.springframework.data.annotation.Transient
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @NotNull(message = "name cannot be null")
    @Size(min = 2, max = 45, message = "Name size must be between 2 to 45")
    private String name;


    @Column(name = "price")
    @DecimalMin("10")
    private Double price;


}
