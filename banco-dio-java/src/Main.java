import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();

        cliente.setNome("Venilton");
        cliente1.setNome("Artur");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(100.0);
        cc.transferir(100.0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}