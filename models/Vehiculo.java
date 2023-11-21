package hn.unah.lenguajes.examen_unidad2_lenguajes.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {
    @Id
    @Column(name = "idvehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    private String marca;

    private boolean disponible;

    private int anio;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private TipoVehiculo tipoVehiculo;

    public boolean getDisponible() {
        return this.disponible;
    }
}
