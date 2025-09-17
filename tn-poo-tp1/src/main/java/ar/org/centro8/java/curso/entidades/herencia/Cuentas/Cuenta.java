package ar.org.centro8.java.curso.entidades.herencia.Cuentas;

import ar.org.centro8.java.curso.entidades.herencia.Clientes.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(int numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositarEfectivo(double monto) {
        this.saldo += monto;
    }

    public abstract void extraerEfectivo(double monto);
}