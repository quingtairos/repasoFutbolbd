package entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "partidos")
public class Partido {

    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    private Integer golesLocal;
    private Integer golesVisitante;

    @OneToOne(mappedBy = "local")
    private Equipo local;

    @OneToOne(mappedBy = "visitante")
    private Equipo visitante;

}
