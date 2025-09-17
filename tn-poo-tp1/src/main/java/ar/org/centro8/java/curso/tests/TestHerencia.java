package ar.org.centro8.java.curso.tests;
import java.util.Date;

import ar.org.centro8.java.curso.entidades.herencia.Clientes.ClienteEmpresa;
import ar.org.centro8.java.curso.entidades.herencia.Clientes.ClientePersona;
import ar.org.centro8.java.curso.entidades.herencia.Cuentas.CajaDeAhorro;
import ar.org.centro8.java.curso.entidades.herencia.Cuentas.Cheque;
import ar.org.centro8.java.curso.entidades.herencia.Cuentas.CuentaConvertibilidad;
import ar.org.centro8.java.curso.entidades.herencia.Cuentas.CuentaCorriente;

public class TestHerencia {
    public static void main(String[] args) {
        // ** Clientes **
        ClientePersona cliente1 = new ClientePersona(1, "Pilar", "Gutierrez", "45925632");
        ClienteEmpresa cliente2 = new ClienteEmpresa(2, "Fueguia", "30-49284619-7");

        System.out.println("Cliente persona: " + cliente1.getNombre() + " " + cliente1.getApellido());
        System.out.println("Cliente empresa: " + cliente2.getNombreFantasia());

        // ** Caja de ahorro **
        CajaDeAhorro cajaAhorro = new CajaDeAhorro(1, cliente1, 0.05);
        cajaAhorro.depositarEfectivo(1000);
        cajaAhorro.cobrarInteres();
        cajaAhorro.extraerEfectivo(300);
        System.out.println("Saldo Caja de Ahorro: " + cajaAhorro.getSaldo());

        // ** Cuenta corriente **
        CuentaCorriente cuentaCorriente = new CuentaCorriente(2, cliente1, 500);
        cuentaCorriente.depositarEfectivo(1500);
        Cheque cheque = new Cheque(1000, "Banco BBVA", new Date());
        cuentaCorriente.depositarCheque(cheque);
        cuentaCorriente.extraerEfectivo(1000); // usa descubierto
        System.out.println("Saldo Cuenta Corriente: " + cuentaCorriente.getSaldo());

        // ** Cuenta convertibilidad **
        CuentaConvertibilidad cuentaConv = new CuentaConvertibilidad(3, cliente2, 1000);
        cuentaConv.depositarEfectivo(5000);
        cuentaConv.depositarDolares(500);
        cuentaConv.convertirPesosADolares(2000);
        cuentaConv.extraerDolares(400);
        System.out.println("Saldo Pesos: " + cuentaConv.getSaldoPesos());
        System.out.println("Saldo Dólares: " + cuentaConv.getSaldoDolares());
    }
}