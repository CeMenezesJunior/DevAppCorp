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
import javax.validation.constraints.Email;

@Entity
public class Autor {
  @Id@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private int ordem;
  private Email email;
  @Column(length=64)
  private String firstName;
  @Column(length=64)
  private String middleName;
  @Column(length=64)
  private String lastName;
  @Column(length=256)
  private String afiliacaoOr;
  @Column(length=256)
  private String afiliacaoIn;
  @Column(length=2)
  private String pais;
  private String orcIn;
  @ManyToOne
  private Artigo artigo;
}
