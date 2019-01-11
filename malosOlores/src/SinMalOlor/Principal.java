/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinMalOlor;

import SinMalOlor.Extract_Method.Empresa;
import SinMalOlor.Extract_SuperClass.Worker;



/**
 *
 * @author Carlos
 */
public class Principal {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();
        miEmpresa.GuardarCliente("Alberto", "Castillo", "0987678711");
        miEmpresa.GuardarCliente("Ana", "Vera", "1780982211");
        miEmpresa.GuardarCliente("Diana", "Andrade", "1209339980");
        miEmpresa.empleados.add(new Worker(450.0f, 0.05f));
        miEmpresa.mostrarTodo();
    }
}
