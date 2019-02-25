package oauth2.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", length = 15, nullable = false)
    private String userName;

    @Column(name = "password", nullable = false) //lenth = 255 is default varchar
    private String password;

    @Column(name = "role", length = 20)
    private String role;

    @Column(name = "enabled")
    private short enabled;
}
