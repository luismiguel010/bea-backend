package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.domain.Job;
import com.co.penol.bea.domain.User;
import com.co.penol.bea.domain.UserWithJobs;
import com.co.penol.bea.domain.repository.CvRepository;
import com.co.penol.bea.domain.repository.JobRepository;
import com.co.penol.bea.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserWithJobsService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    JobRepository jobRepository;
    @Autowired
    CvRepository cvRepository;

    public List<UserWithJobs> getAllUserWithJobs() {
        List<User> userList = userRepository.getAllUser();
        List<UserWithJobs> userWithJobsList = new ArrayList<>();
        for (User user: userList) {
            Job job = getJobByIdCv(getCvByIdUser(user.getIdUser()).getJobCvList().get(0).getIdJob());
            if(job != null) {
                UserWithJobs userWithJobs = new UserWithJobs(
                        user.getIdUser(),
                        user.getIdentificationCard(),
                        user.getNames(),
                        user.getLastnames(),
                        user.getPhone(),
                        user.getAddress(),
                        user.getEmail(),
                        user.getAcademicProfile(),
                        job.getName(),
                        user.getProfession());
                userWithJobsList.add(userWithJobs);
            }
        }
        return userWithJobsList;
    }

    public CV getCvByIdUser(String idUser) {
        return cvRepository.getByIdUser(idUser).stream().findFirst().orElse(null);
    }

    public Job getJobByIdCv(String idJob) {
        return jobRepository.getJobById(idJob).stream().findFirst().orElse(null);
    }

}
