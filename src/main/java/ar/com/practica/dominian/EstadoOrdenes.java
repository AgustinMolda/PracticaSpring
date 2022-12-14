package ar.com.practica.dominian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "estados_ordenes")
public class EstadoOrdenes {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", nullable = false, length = 45)
	private String descripcion;
	
	@Column(name = "descripcion_corta", nullable = false, length = 45)
	private String descripcion_corta;
	
	@Column(name = "estado_final")
	private Integer estadoFinal;
}
