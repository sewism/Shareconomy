package de.htwberlin.webtech.service;

import de.htwberlin.webtech.persistence.Category;
import de.htwberlin.webtech.persistence.EntryEntity;
import de.htwberlin.webtech.persistence.EntryRepository;
import de.htwberlin.webtech.persistence.UserRepository;
import de.htwberlin.webtech.web.api.Entry;
import de.htwberlin.webtech.web.api.EntryManipulationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntryService {

    private final EntryRepository entryRepository;
    private final UserRepository userRepository;
    private final UserTransformer userTransformer;

    public EntryService(EntryRepository entryRepository, UserRepository userRepository, UserTransformer userTransformer) {
        this.entryRepository = entryRepository;
        this.userRepository = userRepository;
        this.userTransformer = userTransformer;
    }

    public List<Entry> findAll(){
        List<EntryEntity> entries = entryRepository.findAll();
        return entries.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());

    }

    public Entry findById(Long id){
        var entryEntity = entryRepository.findById(id);
        return entryEntity.map(this::transformEntity).orElse(null);
    }

    public Entry create(EntryManipulationRequest request) {
        var category = Category.valueOf(request.getCategory());
        var user = userRepository.findById(request.getUserId()).orElseThrow();
        var entryEntity = new EntryEntity(request.getTitel(), request.getDescription(), request.getTimestamp(), category, request.getZipcode(), user);
        entryEntity = entryRepository.save(entryEntity);
        return transformEntity(entryEntity);
    }

    private Entry transformEntity(EntryEntity entryEntity) {
        var category = entryEntity.getCategory() != null ? entryEntity.getCategory().name() : Category.RAMSCH.name();
        return new Entry(
                entryEntity.getId(),
                entryEntity.getTitel(),
                entryEntity.getDescription(),
                entryEntity.getTimestamp(),
                category,
                entryEntity.getZipcode(),
                userTransformer.transformEntity(entryEntity.getUser()));
    }
}
