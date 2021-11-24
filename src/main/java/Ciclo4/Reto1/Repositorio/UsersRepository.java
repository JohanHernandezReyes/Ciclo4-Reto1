
package Ciclo4.Reto1.Repositorio;


import Ciclo4.Reto1.Modelo.Users;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepository {
    
    @Autowired
    private Interface_Users UsersCRUD;
    
    public List<Users> MostrarUsuarios(){
        return (List<Users>) UsersCRUD.findAll();
    }
    
    public Optional<Users> BuscarUsuario(String email){
        return UsersCRUD.findByEmail(email);
    }
    
    public Optional<Users> BuscarUsuarioKey(String password){
        return UsersCRUD.findByPassword(password);
    }
    
    public Users GuardarUsuario(Users U){
        return UsersCRUD.save(U);
    }
}