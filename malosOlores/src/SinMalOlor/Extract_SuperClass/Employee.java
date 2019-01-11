/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinMalOlor.Extract_SuperClass;

import SinMalOlor.Extract_Class.Ubicación;
import conmalolor.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public abstract class Employee extends Persona
{   

    
    protected final float rmu = (float) 386.0;
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;    
    //variable de tipo employeeType
    //private EmployeeType employeeType;    

    public Employee(float salary, float bonusPercentage)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.Nombre = "Descconocido";
        this.Apellido = "Descconocido";
        this.Cedula = "0000000000";
        this.ubicacion = new Ubicación("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
        
    }
    
    public abstract float cs();
    public abstract float CalculateYearBonus();
    
    
    
    
}
