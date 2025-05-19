/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video3;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    
    private String CBU;
    private String alias;
    private Double saldo;
    
    public void mostrarDatos(){
        System.out.println(CBU + " " +alias +" "+saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAlias(){
        return alias;
    }

    public void setAlias(String nuevoAlias) {
      if (nuevoAlias != null) {
             alias = nuevoAlias;
        }
       
    }

    public void setCBU(String nuevoCBU) {
        if (nuevoCBU != null) {
            CBU = nuevoCBU;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;    
        }
    }   

   private boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }

    public void retirar(double monto) {
        if (saldoDisponible(monto)) {
            saldo -= monto;
       }
    }


}
