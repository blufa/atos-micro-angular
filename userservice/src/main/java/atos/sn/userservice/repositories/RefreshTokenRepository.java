package atos.sn.userservice.repositories;

import atos.sn.userservice.entities.RefreshTokenEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RefreshTokenRepository extends MongoRepository<RefreshTokenEntity, String> {
    void deleteByOwner_Id(ObjectId id);
    default void deleteByOwner_Id(String id) { deleteByOwner_Id(new ObjectId(id)); };
}
