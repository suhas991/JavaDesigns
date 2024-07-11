package com.ust.service;

import com.ust.model.Trainee;
import com.ust.repository.TraineeRepository;

import java.util.List;

public class TraineeServiceImpl implements TraineeService {

    private TraineeRepository traineeRepository;

    public TraineeServiceImpl(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    @Override
    public Trainee save(Trainee trainee) {
        return traineeRepository.save(trainee);
    }

    @Override
    public void delete(int id) {
        traineeRepository.delete(id);
    }

    @Override
    public Trainee findById(int id) {
        return traineeRepository.findById(id);
    }

    @Override
    public List<Trainee> findAll() {
        return traineeRepository.findAll();
    }
}
