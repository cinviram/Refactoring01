/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinMalOlor.Extract_Method;

import SinMalOlor.Extract_Class.Ubicación;
import SinMalOlor.Extract_SuperClass.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cinviram
 */
public class Empresa {

    public List<Cliente> clientes;
    public List<Employee> empleados;

    public Empresa() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void MostrarInformacion(Cliente cliente) {
        validarInformacion(cliente.getNombre(), cliente.getApellido(), cliente.getCedula());
        System.out.println("Datos del Cliente:");
        System.out.println("Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido() + ", con numero de cedula: " + cliente.getCedula());
        System.out.println("Direccion: " + cliente.getUbicacion().mostrarDireccion());
        System.out.println("----------------------");
    }

    public void MostrarInformacionEmp(Employee emp) {
        validarInformacion(emp.getNombre(), emp.getApellido(), emp.getCedula());
        System.out.println("Empleado:");
        System.out.println("Nombre: " + emp.getNombre() + ", Apellido: " + emp.getApellido() + ", con numero de cedula: " + emp.getCedula());
        System.out.println("Direccion: " + emp.getUbicacion().mostrarDireccion());
        System.out.println("----------------------");
    }

    public void GuardarCliente(String Nombre, String Apellido, String Cedula) {
        validarInformacion(Nombre, Apellido, Cedula);
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        cliente.setUbicacion(new Ubicación("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa"));
        this.clientes.add(cliente);
        System.out.println("Nuevo cliente agregado con éxito. Nombre: " + cliente.getNombre() + " Apellido: " + cliente.getApellido());

    }

    public void validarInformacion(String Nombre, String Apellido, String Cedula) {
        final boolean isNameEmpty = Nombre.equals("") && Nombre.length() > 16;
        final boolean isLastnameEmpty = Apellido.equals("") && Apellido.length() > 16;
        final boolean isIdentificationEmpty = !Cedula.equals("") && Cedula.length() < 10;

        if (isLastnameEmpty) {
            imprimirInformacion("Apellido", false);
        } else {
            imprimirInformacion("Apellido", true);
        }
        if (isNameEmpty) {
            imprimirInformacion("Nombre", false);
        } else {
            imprimirInformacion("Nombre", true);
        }
        if (isIdentificationEmpty) {
            imprimirInformacion("Cedula", false);
        } else {
            imprimirInformacion("Cedula", true);

        }

    }

//imprime si los ingresos han sido correctos o incorrectos
    public void imprimirInformacion(String informacion, boolean validacion) {
        if (validacion == true) {
            System.out.println("El ingreso de  " + informacion + "ha sido correcto");
        } else {
            System.out.println("El ingreso de " + informacion + "ha sido incorrecto");
        }

    }

    public void mostrarTodo() {
        //Mostrar los clientes 
        for (Cliente cliente : this.clientes) {
            MostrarInformacion(cliente);
        }
        //Mostrar los empleados 
        for (Employee empleado : this.empleados) {
            MostrarInformacionEmp(empleado);
        }
    }

}
