package ar.org.centro8.java.curso.entidades.herencia.Cuentas;

import ar.org.centro8.java.curso.entidades.herencia.Clientes.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoPesos;
    private double saldoDolares;

    public CuentaConvertibilidad(int numeroCuenta, Cliente cliente, double montoDescubierto) {
        super(numeroCuenta, cliente, montoDescubierto);
        this.saldoPesos = 0.0;
        this.saldoDolares = 0.0;
    }

    public void depositarDolares(double monto) {
        this.saldoDolares += monto;
    }

    public void extraerDolares(double monto) {
        if (saldoDolares >= monto) {
            saldoDolares -= monto;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void convertirPesosADolares(double tasa) {
        double montoConvertido = saldoPesos / tasa;
        saldoDolares += montoConvertido;
        saldoPesos = 0;
    }

    public void convertirDolaresAPesos(double tasa) {
        double montoConvertido = saldoDolares * tasa;
        saldoPesos += montoConvertido;
        saldoDolares = 0;
    }
}