package Exercicio06;
import Exercicio03.Empregado;
public class Vendedor extends Empregado{
    private double valorVenda;
    private double comisao;

    public double getValorVenda(){
        return this.valorVenda;
    }

    public void setValorVenda(double vv){
        this.valorVenda = vv;
    }

    public double getComisao(){
        return this.comisao;
    }

    public void setComisao(double c){
        this.comisao = c;
    }

    @Override
    public double calcularSalario(){
        return (getSalBase()-(getSalBase()*(getImposto()/100)))+(getValorVenda()*(getComisao()/100));
    }


    public double calcularSalario(double s,double vv, double c, double i){
        return (s-(s*(i/10)))+(vv*(c/100));
    }

    public Vendedor(){
        
    }
}