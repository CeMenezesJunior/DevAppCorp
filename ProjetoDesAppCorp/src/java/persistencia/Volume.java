/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Volume implements Serializable{
    @Id@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(length=32)
    private String sigla;
    private int NumEvento;
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(length=2048)
    private String DescricaoPT;
    @Column(length=2048)
    private String DescricaoEN;
}
