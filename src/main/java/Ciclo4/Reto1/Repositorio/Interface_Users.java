
package Ciclo4.Reto1.Repositorio;

import Ciclo4.Reto1.Modelo.Users;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface Interface_Users extends CrudRepository<Users, Integer>{
    
    public Optional <Users> findByEmail(String email);
    public Optional <Users> findByPassword(String password);
}
