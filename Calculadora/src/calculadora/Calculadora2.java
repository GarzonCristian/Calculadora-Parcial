/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantes
 */
public class Calculadora2 {

float Numero1; 

    public float getNumero1() {
        return Numero1;
    }

    public void setNumero1(float Numero1) {
        this.Numero1 = Numero1;
    }

    public float getNumero2() {
        return Numero2;
    }

    public void setNumero2(float Numero2) {
        this.Numero2 = Numero2;
    }

    public float getResult() {
        return Result;
    }

    public void setResult(float Result) {
        this.Result = Result;
    }
    float Numero2;
    float Result;
    
    public float suma(){
          
        Result= Numero1+Numero2;
        return Result;
    }
    
    public float resta(){
          
        Result= Numero1-Numero2;
        return Result;
    }
    
    public float multiplicacion(){
          
        Result= Numero1*Numero2;
        return Result;
    }
    
    public float division(){
          
        Result= Numero1/Numero2;
        return Result;
    }    
}
