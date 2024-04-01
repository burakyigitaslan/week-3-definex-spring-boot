package com.patika.kredinbizdeservice.producer.strategy;

import com.patika.kredinbizdeservice.producer.dto.NotificationDTO;
import org.springframework.stereotype.Component;

public interface NotificationStrategy {
    void sendNotification(NotificationDTO notification);
}
