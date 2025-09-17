package ar.org.centro8.java.curso.entidades.herencia.Clientes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteEmpresa extends Cliente {
    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(int numeroCliente, String nombreFantasia, String cuit) {
        super(numeroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
}