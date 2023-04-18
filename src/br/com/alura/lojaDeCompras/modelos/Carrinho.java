package br.com.alura.lojaDeCompras.modelos;

public class Carrinho {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double saldo){
        if (saldo > 0 ){
            setSaldo(saldo);
        }
    }

    public boolean comprar(double saldo){
        if (this.saldo > saldo ){
            this.saldo -= saldo;
           return true;
        }
        return false;
    }


}
