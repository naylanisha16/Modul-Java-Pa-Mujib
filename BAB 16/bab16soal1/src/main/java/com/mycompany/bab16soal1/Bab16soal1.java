/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16soal1;

/**
 *
 * @author ASUS
 */
public class Bab16soal1 {

    abstract class ArithmeticOperation {
        protected double a;
        protected double b;
        
        public ArithmeticOperation(double a, double b) {
            this.a = a;
            this.b = b;
        }
        
        protected abstract double add();
        protected abstract double subtract();
        protected abstract double multiply();
        protected abstract double divide();
    }
    
    class ArithmeticImplementation extends ArithmeticOperation {
        
        public ArithmeticImplementation(double a, double b) {
            super(a, b);
        }
        
        @Override
        protected double add() {
            return a + b;
        }
     
        @Override
        protected double subtract() {
            return a - b;
        }
        
        @Override
        protected double multiply() {
            return a * b;
        }
        
        @Override
        protected double divide() {
            if (b == 0) {
                throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
            }
            return a / b;
        }
        
        
    }
}
