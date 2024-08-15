package com.wecp.event_management_system.repositories;
 
import com.wecp.event_management_system.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
 
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByPlannerId(Long plannerId);
}