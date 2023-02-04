package atos.sn.cvservice.services;


import atos.sn.cvservice.entites.TrainingEntity;

import java.util.List;

public interface TraningService {
    TrainingEntity addTrainingEntity(TrainingEntity training);
    TrainingEntity editTrainingEntity(TrainingEntity training);
    List<TrainingEntity> getTranings();
    TrainingEntity getTraining(String id);
    void deleteTraining(String id);
}
