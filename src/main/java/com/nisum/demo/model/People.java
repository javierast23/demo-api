package com.nisum.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class People {
    private String name;
    private String lastName;
    private String rut;
    private Integer age;
    private List<People> sons;
}
