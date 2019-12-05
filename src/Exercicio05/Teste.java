package Exercicio05;
import java.util.Scanner;

public class Teste{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Operario operario = new Operario();

        System.out.println("Digite o nome de Operario: ");
        operario.setNome(in.nextLine());
        System.out.println("Digite o Codigo de Setor do Operario");
        operario.setCdSetor(in.nextInt());
        System.out.println("Digite o telefone do Operario: ");
        operario.setTelefone(in.next());
        System.out.println("Digite o Salario base do Operario: ");
        operario.setSalBase(in.nextDouble());
        System.out.println("Digite o imposto a ser pago pelo Operario: ");
        operario.setImposto(in.nextDouble());
        System.out.println("Digite o valor da Producao");
        operario.setValorProducao(in.nextInt());
        System.out.println("Digite a porcentagem de comisao");
        operario.setComisao(in.nextInt());
        System.out.println("Digite o endereço do Operario:");
        operario.setEndereco(in.next());
        
        System.out.println("Codigo:"+operario.getCdSetor()+"\tNome:"+operario.getNome()+"\tendereco:"+operario.getEndereco()+"\t\nTelefone:"+operario.getTelefone()+"\tSalario:"+operario.calcularSalario());

    }
}