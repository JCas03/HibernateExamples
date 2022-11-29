package DTO;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name ="USER")
public class UserDetails {
    @Id
    @Column(name ="USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name ="USER_NAME")
    private String userName;


}