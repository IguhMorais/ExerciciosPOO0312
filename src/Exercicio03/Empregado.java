package Exercicio03;
import Exercicio01.Pessoa;

public class Empregado extends Pessoa{
    private int cdSetor;
    private double salBase;
    private double imposto;

    public Empregado(){

    }

    public int getCdSetor(){
        return this.cdSetor;
    }

    public void setCdSetor(int codigo){
        this.cdSetor = codigo;
    }

    public double getSalBase(){
        return this.salBase;
    }

    public void setSalBase(double sal){
        this.salBase = sal;
    }

    public double getImposto(){
        return this.imposto;
    }

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double calcularSalario(){
        return getSalBase()-(getSalBase()*(getImposto()/100));
    }

    public double calcularSalario(double sal , double imposto){
        return sal-(sal*(imposto/100));
    }


}