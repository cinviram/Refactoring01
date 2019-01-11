/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinMalOlor.Extract_Class;

/**
 *
 * @author Carlos
 */
public class Ubicación {

    private String ciudad;
    private String pais;
    private String direccion;
    private String provincia;

    public String mostrarDireccion() {
        String dir = pais + " - " + provincia + " - " + ciudad;
        return dir + "\n" + direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Ubicación(String ciudad, String pais, String direccion, String provincia) {
        this.ciudad = ciudad;
        this.pais = pais;
        this.direccion = direccion;
        this.provincia = provincia;
    }

    public Ubicación() {
    }
    
}
