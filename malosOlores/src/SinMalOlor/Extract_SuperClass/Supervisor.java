/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinMalOlor.Extract_SuperClass;

import SinMalOlor.Extract_SuperClass.Employee;
import SinMalOlor.Extract_Class.Fecha;

/**
 *
 * @author Carlos
 */
public class Supervisor extends Employee{

    public Supervisor(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
    }

    @Override
    public float cs() {
        float valueS = salary + (bonusPercentage * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
        return Fecha.getMes()%2==0?valueS:valueS + rmu/12*2;
    }

    @Override
    public float CalculateYearBonus() {
        return salary + salary * 0.7F;
    }
    
}
