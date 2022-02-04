package com.producter.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class InputPlayerAdd {
    @NotBlank
    String name;
    @NotBlank
    String surname;
    @NotNull
    Position position;

    public Player toPlayer() {
        return new Player(0, name, surname, position);
    }
}
