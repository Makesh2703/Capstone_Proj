package com.wecp.event_management_system.repositories;
 
import com.wecp.event_management_system.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
 
import java.util.List;
 
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAssignedStaffId(Long staffId);
}