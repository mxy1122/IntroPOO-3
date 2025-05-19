/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video3;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
       
        cuenta.setAlias("MiCuenta");
        cuenta.mostrarDatos();
        cuenta.setAlias("NuevoAlias");
        cuenta.mostrarDatos();

        cuenta.saldoDisponible(1000);
    
        String a = cuenta.getAlias();
        System.out.println(a);

   
   
   
    }   

    
}
