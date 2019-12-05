package Exercicio05;
import Exercicio03.Empregado;

public class Operario extends Empregado{
    private double valorProducao;
    private double comisao;

    public double getValorProducao(){
        return this.valorProducao;
    }

    public void setValorProducao(double vp){
        this.valorProducao = vp;
    }

    public double getComisao(){
        return this.comisao;
    }

    public void setComisao(double c){
        this.comisao = c;
    }

    @Override
    public double calcularSalario(){
        return getSalario()+(getValorProducao()*(getComisao()/100));
    }

    @Override
    public double calcularSalario(double s,double vp, double c){
        return s+(vp*(c/100));
    }

    public Operario(){
        
    }
}