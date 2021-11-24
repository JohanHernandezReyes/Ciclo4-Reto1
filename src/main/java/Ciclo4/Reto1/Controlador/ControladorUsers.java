
package Ciclo4.Reto1.Controlador;

import Ciclo4.Reto1.Modelo.Users;
import Ciclo4.Reto1.Servicios.UsersServices;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@CrossOrigin(origins="*", methods={RequestMethod.GET, RequestMethod.POST})
public class ControladorUsers {
    
    @Autowired
    private UsersServices UsersServices;
    
    @GetMapping("/all")
    public List<Users> MostrarUsers(){
        return UsersServices.MostrarUsers();
    }
    
    @GetMapping("/{email}")
    public boolean BuscarUser(@PathVariable("email") String email){
        return UsersServices.BuscarUser(email);
    }
    
    @GetMapping("/{email}/{password}")
    public Optional<Users> BuscarUserX(@PathVariable("email") String email, @PathVariable("password") String password){
        return UsersServices.BuscarUserKey(email, password);
    }
   
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Users GuardarUser(@RequestBody Users U){
        return UsersServices.GuardarUser(U);
    }
    
}