
package Ciclo4.Reto1.Servicios;

import Ciclo4.Reto1.Modelo.Users;
import Ciclo4.Reto1.Repositorio.UsersRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServices {
    
    @Autowired
    private UsersRepository UsersRepository;
    
 
    public List <Users> MostrarUsers(){
        return (List<Users>) UsersRepository.MostrarUsuarios();
    }    
    
 
    public boolean BuscarUser(String email){
        Optional<Users> UserX=UsersRepository.BuscarUsuario(email);
         if(UserX.isPresent()){
            return true;
        }
        return false;  
    }
    
    
    public Optional<Users> BuscarUserKey (String email, String password){
        Optional<Users> UserX=UsersRepository.BuscarUsuario(email);
        Optional<Users> UserY=UsersRepository.BuscarUsuarioKey(password);
        Users UserZ=new Users();
        UserZ.setEmail(email);UserZ.setPassword(password); UserZ.setName("NO DEFINIDO");
        if(UserX.isPresent() && UserX.equals(UserY)){
            return UserX;
        }
        return Optional.of(UserZ);  
    }

    public Users GuardarUser(Users U){
        if (U.getId()==null){
            return UsersRepository.GuardarUsuario(U);
        }else{
            Optional<Users> UserX=UsersRepository.BuscarUsuario(U.getEmail());
            if(!UserX.isPresent()){
                return UsersRepository.GuardarUsuario(U);
            } else {
                return U;
            }     
        }
    }
 
}