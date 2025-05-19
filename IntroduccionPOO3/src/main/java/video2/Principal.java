/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video2;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setAlias("MiCuenta");
        cuenta.depositar(1000);
        cuenta.mostrarDatos();
        
        System.out.println("El saldo es: " + cuenta.getSaldo());
        System.out.println("El alias es: " + cuenta.getAlias());
    }

    
}
