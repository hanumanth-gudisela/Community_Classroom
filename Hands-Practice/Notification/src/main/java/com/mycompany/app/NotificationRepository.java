package com.mycompany.app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,NotificationRepository> {
}
