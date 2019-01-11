/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinMalOlor.Extract_SuperClass;

import SinMalOlor.Extract_Class.Ubicación;

/**
 *
 * @author Carlos
 */
public class Persona {
    protected String Nombre;
    protected String Apellido;
    protected String Cedula;
    protected Ubicación ubicacion;
    
    protected String telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Ubicación getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicación ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
