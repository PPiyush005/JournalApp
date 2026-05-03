package com.ppiyush.jounalApp.Service;

import com.ppiyush.jounalApp.entity.JournalEntry;
import com.ppiyush.jounalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository JournalEntryRepository;


    public void saveEntry(JournalEntry journalEntry){
        JournalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return JournalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findbyId(ObjectId id){
        return JournalEntryRepository.findById(id);
    }

    public void deletebyid(ObjectId id){
        JournalEntryRepository.deleteById(id);
    }
}
