package Exercicio02;
import Exercicio01.Pessoa;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito(){
        return this.valorCredito;
    }

    public void setValorCredito(double credito){
        this.valorCredito = credito;
    }

    public double getValorDivida(){
        return this.valorDivida;
    }

    public void setValorDivida(double divida){
        this.valorDivida = divida;
    }

    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }
    public Fornecedor(){
        
    }
}