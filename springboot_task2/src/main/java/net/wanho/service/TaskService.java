package net.wanho.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Scheduled(cron = "0/2 * 3 * * ?")
    public void job() {
        System.out.println("任务进行中。。。");
    }
}
