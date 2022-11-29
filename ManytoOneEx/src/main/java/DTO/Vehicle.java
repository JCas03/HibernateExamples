package DTO;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name="VEHICLE")
public class Vehicle
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="VEHICLE_ID")
    private int vehicleId;

    @Column(name="VEHICLE_NAME")
    private String vehicleName;

    @ManyToOne
    @JoinColumn(name ="USER_ID")
    private UserDetails user;


}
