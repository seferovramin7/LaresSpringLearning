package com.ltc.laresspringlearning.repository;

import com.ltc.laresspringlearning.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
