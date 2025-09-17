package ar.org.centro8.java.curso.entidades.herencia.Cuentas;

import ar.org.centro8.java.curso.entidades.herencia.Clientes.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaCorriente extends Cuenta {
    private double montoDescubierto;

    public CuentaCorriente(int numeroCuenta, Cliente cliente, double montoDescubierto) {
        super(numeroCuenta, cliente);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (getSaldo() + montoDescubierto >= monto) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void depositarCheque(Cheque cheque) {
        setSaldo(getSaldo() + cheque.getMonto());
    }
}