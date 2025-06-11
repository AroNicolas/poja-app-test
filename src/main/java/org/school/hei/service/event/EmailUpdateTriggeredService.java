package org.org.school.service.event;

import jakarta.mail.internet.InternetAddress;
import java.util.List;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.org.school.endpoint.event.model.EmailUpdateTriggered;
import org.org.school.mail.Email;
import org.org.school.mail.Mailer;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailUpdateTriggeredService implements Consumer<EmailUpdateTriggered> {
  private final Mailer mailer;

  @SneakyThrows
  @Override
  public void accept(EmailUpdateTriggered emailUpdateTriggered) {
    var recipientAddress = new InternetAddress("your@email.com");
    mailer.accept(
        new Email(
            recipientAddress,
            List.of(),
            List.of(),
            "",
            "Here is your automatic daily email update !",
            List.of()));
  }
}
