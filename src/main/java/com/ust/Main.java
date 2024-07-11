package com.ust;

import com.ust.model.Trainee;
import com.ust.model.TraineeBuilder;
import com.ust.repository.TraineeRepositoryImpl;
import com.ust.service.TraineeService;
import com.ust.service.TraineeServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TraineeRepositoryImpl repository = TraineeRepositoryImpl.getInstance();
        TraineeService service = new TraineeServiceImpl(repository);


        service.save(new TraineeBuilder(1, "Karan", "karan@yahoo.com")
                .location("Mumbai")
                .phoneNumber("1234567890")
                .gender("Male")
                .build());

        service.save(new TraineeBuilder(2, "Rahul", "rahul@yahoo.com")
                .location("Delhi")
                .build());


        List<Trainee> allTrainees = service.findAll();
        allTrainees.forEach(i-> System.out.println(i));
    }
}
