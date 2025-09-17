package ar.org.centro8.java.curso.entidades.herencia.Cuentas;

import ar.org.centro8.java.curso.entidades.herencia.Clientes.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CajaDeAhorro extends Cuenta {
    private double tasaInteres;

    public CajaDeAhorro(int numeroCuenta, Cliente cliente, double tasaInteres) {
        super(numeroCuenta, cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void cobrarInteres() {
        setSaldo(getSaldo() + getSaldo() * tasaInteres);
    }
}