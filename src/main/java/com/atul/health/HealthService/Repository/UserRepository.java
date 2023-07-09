package com.atul.health.HealthService.Repository;

import com.atul.health.HealthService.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


//    static Optional<Object> findByToken(String token) {
//    }

    public static Optional<User> findByToken(String token) {
        return UserRepository.findByToken(token);
    }

//    public static Optional<Object> findByToken(String token) {
//        return userRepository.findByToken(token).map(user -> (Object) user);
//    }

}
