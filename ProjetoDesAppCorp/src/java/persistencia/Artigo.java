/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author edu_j
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Entity
public class Artigo {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int ordem;
    @Column(length = 2)
    private String idioma;
    @Column(length=256)
    private String tituloOr;
    @Column(length=256)
    private String tituloIn;
    @Column(length = 2048)
    private String resumo;
    @Column(length = 256)
    private String keyWordOr;
    @Column(length = 256)
    private String keyWordIn;
    private int NumPag;
    @ManyToOne
    private Volume volume;
}
