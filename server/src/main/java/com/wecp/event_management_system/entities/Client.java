package com.wecp.event_management_system.entities;
 
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name="clients")
public class Client extends User {
    
}