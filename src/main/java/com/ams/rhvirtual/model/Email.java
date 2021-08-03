package com.ams.rhvirtual.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ams.rhvirtual.enums.StatusEmail;

@Entity
@Table(name = "email")
public class Email implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String emailRef;
	private String emailFrom;
	private String emailTo;
	private String subject;

	@Column(columnDefinition = "TEXT")
	private String text;
	private LocalDateTime sendDateEmail;
	private StatusEmail statusEmail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailRef() {
		return emailRef;
	}

	public void setEmailRef(String emailRef) {
		this.emailRef = emailRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}

	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}

	public StatusEmail getStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}

}
