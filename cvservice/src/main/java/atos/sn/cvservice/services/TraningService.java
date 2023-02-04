package atos.sn.cvservice.services;


import java.util.List;

import atos.sn.cvservice.entities.TrainingEntity;

public interface TraningService {
    TrainingEntity addTrainingEntity(TrainingEntity training);
    TrainingEntity editTrainingEntity(TrainingEntity training);
    List<TrainingEntity> getTranings();
    TrainingEntity getTraining(String id);
    void deleteTraining(String id);
}
