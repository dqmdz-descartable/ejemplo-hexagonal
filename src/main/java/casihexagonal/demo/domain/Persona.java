package casihexagonal.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

}
