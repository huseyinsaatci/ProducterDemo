package com.producter.demo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Player {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    String name;
    String surname;
    @Enumerated(EnumType.STRING)
    Position position;
}
