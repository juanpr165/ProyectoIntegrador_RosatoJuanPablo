
package com.portfolio.jpr.Repository;

import com.portfolio.jpr.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanp
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
