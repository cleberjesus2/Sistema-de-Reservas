package model;

public class Quarto {
    private int numero;
    private enum tipo{
        Suite, Comum, Luxo
    }
    private tipo tipoQuarto;
    private int capacidade;
    private double precoDiaria;
    private boolean disponivel;

    public Quarto(int numero, tipo tipo, int capacidade, double precoDiaria, boolean disponivel) {
        this.numero = numero;
        this.tipoQuarto = tipo;
        this.capacidade = capacidade;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public tipo getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(tipo tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
