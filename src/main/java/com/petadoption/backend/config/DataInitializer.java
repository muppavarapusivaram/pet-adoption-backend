package com.petadoption.backend.config;

import com.petadoption.backend.model.Role;
import com.petadoption.backend.model.User;
import com.petadoption.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Create default admin user if it doesn't exist
        if (!userRepository.existsByEmail("admin@petadoption.com")) {
            User admin = new User();
            admin.setFirstName("Admin");
            admin.setLastName("User");
            admin.setEmail("admin@petadoption.com");
            admin.setPassword(passwordEncoder.encode("admin123"));
            admin.setRole(Role.ADMIN);
            admin.setPhoneNumber("+1-555-0123");
            admin.setAddress("Admin Office, Pet Adoption Center");
            
            userRepository.save(admin);
            System.out.println("✅ Default admin user created:");
            System.out.println("   Email: admin@petadoption.com");
            System.out.println("   Password: admin123");
            System.out.println("   Role: ADMIN");
        } else {
            System.out.println("ℹ️  Admin user already exists");
        }
    }
}
