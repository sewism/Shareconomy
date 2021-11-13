package de.htwberlin.webtech.service;

import de.htwberlin.webtech.persistence.EntryEntity;
import de.htwberlin.webtech.persistence.EntryRepository;
import de.htwberlin.webtech.web.api.Entry;
import de.htwberlin.webtech.web.api.EntryManipulationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntryService {

    private  final EntryRepository entryRepository;

    public EntryService(EntryRepository entryRepository){
        this.entryRepository = entryRepository;
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
        var entryEntity = new EntryEntity(request.getTitel(), request.getTimestamp(), request.getCategory(), request.getZipcode(), request.getUser());
        entryEntity = entryRepository.save(entryEntity);
        return transformEntity(entryEntity);
    }

    private Entry transformEntity(EntryEntity entryEntity) {
        return new Entry(
                entryEntity.getId(),
                entryEntity.getTitel(),
                entryEntity.getTimestamp(),
                entryEntity.getCategory(),
                entryEntity.getZipcode(),
                entryEntity.getUser()
        );
    }
}
