package com.ams.rhvirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.rhvirtual.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
