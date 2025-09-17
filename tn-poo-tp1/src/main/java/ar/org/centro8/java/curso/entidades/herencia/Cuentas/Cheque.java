package ar.org.centro8.java.curso.entidades.herencia.Cuentas;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private Date fechaPago;
}