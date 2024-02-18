package com.projetoEmail.ProjetoEmail.service;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.projetoEmail.ProjetoEmail.Dto.CorpoEmailDto;
import com.projetoEmail.ProjetoEmail.model.User;

import jakarta.transaction.Transactional;
@Service
public class EnviaEmail {
	@Autowired
	private UserService userService;
	
	@Transactional
	@Scheduled(fixedRate = 30000)
	public void enviaEmail() {
		Properties props = new Properties();
		CorpoEmailDto corpoEmail = new CorpoEmailDto();
		WebScrappingPoema poemaWebScrapping = new WebScrappingPoema();

		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("poemadiario84@gmail.com", "nkaz whgi vfwe gdgs");
			}
		});

		session.setDebug(true);
		
		for(User user : userService.retornaDados()) {
			try {
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("poemadiario84@gmail.com"));
				
				Address[] toUser = InternetAddress.parse(user.getEmail());
				
				message.setRecipients(Message.RecipientType.TO, toUser);
				message.setSubject("Poema do dia");
				message.setText(corpoEmail.organizaHtml(user.getEmail(), poemaWebScrapping.buscaPoema()));
				message.setContent(corpoEmail.organizaHtml(user.getName(), poemaWebScrapping.buscaPoema()), "text/html; charset=utf-8");
	
				Transport.send(message);
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}
		
	}

}
