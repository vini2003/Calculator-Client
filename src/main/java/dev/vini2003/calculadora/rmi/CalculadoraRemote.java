package dev.vini2003.calculadora.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraRemote extends Remote {
    double getValorA() throws RemoteException;

    double getValorB() throws RemoteException;

    void setValorA(double valorA) throws RemoteException;

    void setValorB(double valorB) throws RemoteException;

    double getAdicao() throws RemoteException;

    double getSubtracao() throws RemoteException;

    double getProduto() throws RemoteException;

    double getDivisao() throws RemoteException;
}
