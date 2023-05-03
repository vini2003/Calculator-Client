package dev.vini2003.calculadora;

import dev.vini2003.calculadora.rmi.CalculadoraRemote;

import java.rmi.registry.LocateRegistry;

public class RMIClient {
    public static void main(String[] args) throws Exception {
        var registry = LocateRegistry.getRegistry("localhost");
        var obj = registry.lookup("calculadora");
        // or var obj = Naming.lookup("rmi://localhost/mensagens");

        var calculadora = (CalculadoraRemote) obj;
        calculadora.setValorA(1.0D);
        calculadora.setValorB(1.0D);

        System.out.println("Mensagem adicao: " + calculadora.getAdicao());
        System.out.println("Mensagem subtracao: " + calculadora.getSubtracao());
        System.out.println("Mensagem produto: " + calculadora.getProduto());
        System.out.println("Mensagem divisao: " + calculadora.getDivisao());
    }
}
