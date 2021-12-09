package de.htwberlin.webtech.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<EntryEntity, Long> {

    List<EntryEntity> findEntryEntityByCategory(Category category);

    UserEntity findUserEntityById(Long id);
}
