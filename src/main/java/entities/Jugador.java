package entities;

import edu.maria.enumerated.Posicion;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugadores")
public class Jugador {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(mappedBy = "jugador")
    private Long id;
    private String nombre;
    private int edad;
    @Enumerated
    private Posicion posicion;
    

}
