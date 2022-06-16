package com.alkemy.icon.icons.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "continente")
@Getter
@Setter
@SQLDelete(sql = "UPDATE continente SET deleted= true WHERE id=?") //esta anotacion sirve para usar el soft delete
@Where(clause = "deleted = false")//de esta manera queda diferenciado aquellos que fueron borrados los q no.
public class ContinentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String imagen;
    
    private String denominacion;

    private boolean deleted = Boolean.FALSE;
}
