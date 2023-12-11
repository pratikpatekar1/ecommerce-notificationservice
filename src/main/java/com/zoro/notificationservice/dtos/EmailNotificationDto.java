package com.zoro.notificationservice.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmailNotificationDto {
    private String to;
    private String from;
    private String body;
}
