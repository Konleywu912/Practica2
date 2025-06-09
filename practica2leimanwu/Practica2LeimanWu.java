/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica2leimanwu;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Practica2LeimanWu {

    public static void main(String[] args) {
        Transaccion mitransaccion = new Transaccion(1500,"","");
        String usu = "fidelitas25";
        int contra = 12345;
        while (true) {
            String usuario = JOptionPane.showInputDialog("Digite tu usuario");
            int contrasenia = Integer.parseInt(JOptionPane.showInputDialog("Digite la contraseña"));

            if (usuario == usu || contra == contrasenia) {
                int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\n"
                                                                    + "1)Transferencia"));
                switch(op){
                    case 1: mitransaccion.calcularImpuesto();
                            break;
                    case 2:
                     
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto, preubelo nuevamente");
            }
        }
    }
}
