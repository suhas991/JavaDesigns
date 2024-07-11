package com.ust.service;
import com.ust.model.Trainee;
import java.util.List;

public interface TraineeService {

    Trainee save(Trainee trainee);
    void delete(int id);
    Trainee findById(int id);
    List<Trainee> findAll();
}
