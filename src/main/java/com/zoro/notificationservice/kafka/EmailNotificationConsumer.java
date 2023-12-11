package com.zoro.notificationservice.kafka;

import com.zoro.notificationservice.dtos.EmailNotificationDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationConsumer {
    @KafkaListener(topics = "emailSignupNotification", groupId = "emailNotification", containerFactory = "emailNotificationKafkaListenerContainerFactory")
    public void consume(EmailNotificationDto message) {
        System.out.println("Consumed message: " + message);
    }
}
