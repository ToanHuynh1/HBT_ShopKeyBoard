package edu.baotoan.service;

import java.io.IOException;

import javax.mail.MessagingException;

import edu.baotoan.model.MailInfo;

public interface SendMailService {

	void run();

	void queue(String to, String subject, String body);

	void queue(MailInfo mail);

	void send(MailInfo mail) throws MessagingException, IOException;

}
