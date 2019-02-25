package oauth2.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Data
@Entity
@Table(name = "users")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", length = 15, nullable = false)
    @JsonProperty(value = "username")
    private String userName;

    @Column(name = "password")
  //  @Size(min = 5, max = 60)
    private String password;

    @Column(name = "role", length = 20)
    private String role;

    @Column(name = "enabled")
    private short enabled;
}

