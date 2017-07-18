package io.github.pascalgrimaud.testjhipsteronline.repository;

import io.github.pascalgrimaud.testjhipsteronline.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
