package com.ams.rhvirtual.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ams.rhvirtual.adapter.EmailAdapter;
import com.ams.rhvirtual.model.Email;
import com.ams.rhvirtual.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/sending-email")
	public ResponseEntity<Email> sendingEmail(@RequestBody @Valid EmailAdapter emailAdapter) {
		Email email = new Email();
		BeanUtils.copyProperties(emailAdapter, email);
		emailService.sendEmail(email);
		return new ResponseEntity<>(email, HttpStatus.CREATED);
	}

}
