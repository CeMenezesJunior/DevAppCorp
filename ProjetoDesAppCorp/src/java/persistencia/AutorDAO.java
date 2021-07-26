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
public interface AutorDAO {
    void salva(Autor a);
    Autor recupera(Long id);
}
