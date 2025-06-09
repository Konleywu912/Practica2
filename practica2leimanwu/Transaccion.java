/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2leimanwu;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Transaccion {

    private double monto;
    private String des;
    private String fecha;

    public Transaccion(double monto, String des, String fecha) {
        this.monto = monto;
        this.des = des;
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void calcularImpuesto() {
        int impuesto = 0;
        double rebaja = 0;
        String mont = JOptionPane.showInputDialog("Tu monto es " + monto
                + "\n¿Te gustaria hacer una trasnferencia(Si/No)");
        if (mont.equalsIgnoreCase("si")) {
            int trans = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto seria el monto a trasnferir?"));

            impuesto = trans + 15;

            String aceptar = JOptionPane.showInputDialog("Su monto de trasnferencia es de $" + impuesto
                    + "\n¿Quieres hacer la transferencia?(Si/No)");
            if (aceptar.equalsIgnoreCase("si")) {
                if (monto > impuesto) {
                    JOptionPane.showMessageDialog(null, "La transferencia ha sido exitosa");
                    rebaja = monto - impuesto;
                    monto = rebaja;
                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + rebaja);

                } else {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                }

            }

        }
    }

    public void saldoActual() {
        JOptionPane.showMessageDialog(null, "Tu saldo actual es: $" + monto);

    }
}
