package com.co.penol.bea.domain.components;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.co.penol.bea.domain.Job;
import com.co.penol.bea.domain.repository.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasksJobs {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasksJobs.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private JobRepository jobRepository;

    @Scheduled(cron = "0 0 22 * * ?", zone = "America/Bogota")
    public void setAvailableJob() {
        List<Job> jobList = jobRepository.getAllJob();
        for (Job job:jobList) {
            if(job.getDateFinish().getDayOfYear() == LocalDateTime.now().getDayOfYear()){
                job.setState(false);
                jobRepository.saveJob(job);
            }
        }
    }
}
