package com.ust.repository;

import com.ust.model.Trainee;
import java.util.ArrayList;
import java.util.List;

public class TraineeRepositoryImpl implements TraineeRepository {

    //implementing singleton

    private static TraineeRepositoryImpl instance;
    public static List<Trainee> trainees;

    public TraineeRepositoryImpl(List<Trainee> trainees) {
        this.trainees = new ArrayList<>();
    }

    public static TraineeRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new TraineeRepositoryImpl(trainees);
        }
        return instance;
    }

    @Override
    public Trainee save(Trainee trainee) {
        trainees.add(trainee);
        return trainee;
    }

    @Override
    public void delete(int id) {
        trainees.removeIf(t -> t.getId() == id);
    }

    @Override
    public Trainee findById(int id) {
        return trainees.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Trainee> findAll() {
        return new ArrayList<>(trainees);
    }
}