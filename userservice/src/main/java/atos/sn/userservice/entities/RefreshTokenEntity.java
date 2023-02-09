package atos.sn.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection="refreshTokens")
public class RefreshTokenEntity {
    @Id
    String id;
    @DocumentReference(lazy = true)
    private UserEntity owner;
}
