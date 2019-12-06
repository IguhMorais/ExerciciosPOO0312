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
        return (getSalBase()-(getSalBase()*(getImposto()/100)))+(getValorProducao()*(getComisao()/100));
    }


    public double calcularSalario(double s,double vp, double c, double i){
        return (s-(s*(i/10)))+(vp*(c/100));
    }

    public Operario(){
        
    }
}