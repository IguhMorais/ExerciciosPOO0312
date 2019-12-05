package Exercicio02;
import java.util.Scanner;
public class Teste{
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        Fornecedor fornecedor = new Fornecedor();
        System.out.println("Digite o nome de Fornecedor: ");
        fornecedor.setNome(in.nextLine());
        System.out.println("Digite o endereço do Fornecedor: ");
        fornecedor.setEndereco(in.nextLine());
        System.out.println("Digite o telefone do Fornecedor: ");
        fornecedor.setTelefone(in.next());
        System.out.println("Digite o Credito do Fornecedor: ");
        fornecedor.setValorCredito(in.nextDouble());
        System.out.println("Digite a divida do Fornecedor: ");
        fornecedor.setValorDivida(in.nextDouble());
        
        System.out.print("Nome:"+fornecedor.getNome()+"\tendereco:"+fornecedor.getEndereco()+"\t\nTelefone:"+fornecedor.getTelefone()+"\tSaldo:"+fornecedor.obterSaldo());
        
        
    }
    
}