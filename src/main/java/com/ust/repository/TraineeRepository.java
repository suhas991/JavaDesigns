package com.ust.repository;

import com.ust.model.Trainee;
import java.util.List;

public interface TraineeRepository {

    Trainee save(Trainee trainee);
    void delete(int id);
    Trainee findById(int id);
    List<Trainee> findAll();

}