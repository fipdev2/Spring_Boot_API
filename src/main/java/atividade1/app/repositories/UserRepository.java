package atividade1.app.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atividade1.app.models.User;

@Repository 
public interface UserRepository extends JpaRepository<User, UUID>{
    
}
