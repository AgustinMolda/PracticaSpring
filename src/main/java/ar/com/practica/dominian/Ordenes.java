package ar.com.practica.dominian;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name = "ordenes")


public class Ordenes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern  = "yyyy-MM-dd")
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	
	@ManyToOne
	@JoinColumn(name = "estados_ordenes_id", referencedColumnName = "id")
	private EstadoOrdenes estado;
	
	@Column(name = "monto_total", nullable = false)
	private Float montoTotal;
	
	@ManyToOne
	@JoinColumn(name = "cupones_id", referencedColumnName = "id")
	private Cupones cupon;
	
	public boolean isEstadoFinal() {
			return false;
		
	}
}
