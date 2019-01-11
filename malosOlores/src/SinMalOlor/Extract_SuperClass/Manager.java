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
public class Manager extends Employee{

    public Manager(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
    }

    @Override
    public float cs() {
        float valueM = salary + (bonusPercentage * 0.7F);
        return Fecha.getMes()%2==0?valueM:valueM + rmu/12*2;
    }

    @Override
    public float CalculateYearBonus() {
        return salary + salary * 1.0F;
    }
    
}
