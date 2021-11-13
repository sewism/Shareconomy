package de.htwberlin.webtech.web;

import de.htwberlin.webtech.service.EntryService;
import de.htwberlin.webtech.web.api.Entry;
import de.htwberlin.webtech.web.api.EntryManipulationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class EntryRestController {

    private final EntryService entryService;

    public EntryRestController(EntryService entryService){
        this.entryService = entryService;
    }

    @GetMapping(path = "/api/v1/entries")
    public ResponseEntity<List<Entry>> fetchEntries(){
        return ResponseEntity.ok(entryService.findAll());
    }

    @GetMapping(path = "/api/v1/entries/{id}")
    public ResponseEntity<Entry> fetchEntriesById(@PathVariable Long id){
        var entry = entryService.findById(id);
        return entry != null? ResponseEntity.ok(entry) : ResponseEntity.notFound().build();
    }

    @PostMapping(path = "/api/v1/entries")
    public ResponseEntity<Void> createEntry(@RequestBody EntryManipulationRequest request) throws URISyntaxException {
        var entry = entryService.create(request);
        URI uri = new URI("/api/v1/entries/" + entry.getId());
        return ResponseEntity.created(uri).build();
    }
}
