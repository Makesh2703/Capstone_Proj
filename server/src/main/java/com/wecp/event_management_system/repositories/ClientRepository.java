package com.wecp.event_management_system.repositories;
 
import com.wecp.event_management_system.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

