package ar.org.centro8.java.curso.entidades.herencia.Clientes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientePersona extends Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    public ClientePersona(int numeroCliente, String nombre, String apellido, String dni) {
        super(numeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}