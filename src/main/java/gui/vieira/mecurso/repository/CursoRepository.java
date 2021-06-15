
package gui.vieira.mecurso.repository;

import gui.vieira.mecurso.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CursoRepository extends JpaRepository<Curso, Float> {
    
}
