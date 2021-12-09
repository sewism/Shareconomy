package de.htwberlin.webtech.service;


import de.htwberlin.webtech.persistence.EntryEntity;
import de.htwberlin.webtech.persistence.UserEntity;
import de.htwberlin.webtech.web.api.User;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserTransformer {

    public User transformEntity(UserEntity userEntity) {
        var entryIds = userEntity.getEntries().stream().map(EntryEntity::getId).collect(Collectors.toList());
        return new User(
                userEntity.getId(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getEmail(),
                entryIds);
    }
}
