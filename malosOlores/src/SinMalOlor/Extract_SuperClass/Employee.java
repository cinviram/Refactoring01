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
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
//    public float cs()
//    {
//        
//        switch (employeeType)         
//        {
//            case Worker:
//                //Si el mes es impar entonces le entrega el decimo junto con su salario
//                return month%2==0?salary:salary + rmu/12*2;
//            case Supervisor:
//                float valueS = salary + (bonusPercentage * 0.5F);
//                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
//                return month%2==0?valueS:valueS + rmu/12*2;
//            case Manager:
//                float valueM = salary + (bonusPercentage * 0.7F);
//                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
//                return month%2==0?valueM:valueM + rmu/12*2;
//        }
//        return 0.0F;
//    }
//    //calcula el bonus anual
//    public float CalculateYearBonus() 
//    {
//        switch (employeeType)
//        {
//            case Worker:
//                return 0;
//            case Supervisor:
//                return salary + salary * 0.7F;
//            case Manager:
//                return salary + salary * 1.0F;
//        }
//        return 0.0F;
//    }
    
    
    
    
}
