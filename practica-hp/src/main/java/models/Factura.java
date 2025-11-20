package models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "factura")
@NamedQueries(
    {
        @NamedQuery(name = "Factura.All", query = "select e from Factura e")
    }
)
public class Factura {
    @Id
    private int numeroFactura;

    @Column
    private double total;

    @Column
    private String nombreCliente;

    @Column
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + ", total="
               + total + ", nombreCliente='" + nombreCliente + '\'' + ", fecha="
               + fecha + '}';
    }
}
