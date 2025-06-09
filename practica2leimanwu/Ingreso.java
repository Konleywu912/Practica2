/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2leimanwu;

/**
 *
 * @author leymanwu
 */
public class Ingreso extends Transaccion {
    private double saldoActual;

    public Ingreso(double saldoActual, double monto, String des, String fecha) {
        super(monto, des, fecha);
        this.saldoActual = saldoActual;
    }
    
    
}
