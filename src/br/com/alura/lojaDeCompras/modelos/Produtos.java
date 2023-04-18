package br.com.alura.lojaDeCompras.modelos;

public class Produtos {
    private String description;
    private double valor;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto: " + this.getDescription() + " Valor = " + this.valor;
    }
}
