package com.albumes.albumes.models;


import javax.validation.constraints.Size;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User{

    @Id
    @Size(min=6, max=100, message= "Ingrese su nombre de usuario")
    private String nombre;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public User()
    {
        super();
    }



}