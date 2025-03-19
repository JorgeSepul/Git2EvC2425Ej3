package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor

public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

}
