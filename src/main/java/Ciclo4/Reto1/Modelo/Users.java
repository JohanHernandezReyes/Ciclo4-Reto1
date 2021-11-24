
package Ciclo4.Reto1.Modelo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name="Users")
@Data
public class Users implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name= "user_email", length = 50)
    private String email;
  
    @Column(name="user_password", length = 50)
    private String password;
    
    @Column(name= "user_name", length = 80)
    private String name;


}
