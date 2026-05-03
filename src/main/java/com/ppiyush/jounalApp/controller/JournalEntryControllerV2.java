package com.ppiyush.jounalApp.controller;

import com.ppiyush.jounalApp.Service.JournalEntryService;
import com.ppiyush.jounalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public  List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntrybyid(@PathVariable ObjectId myId){
    return journalEntryService.findbyId(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public boolean  deleteJournalEntrybyid(@PathVariable ObjectId myId){
        journalEntryService.deletebyid(myId);
        return true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntrybyid(@PathVariable ObjectId id , @RequestBody JournalEntry newEntry){
       JournalEntry old = journalEntryService.findbyId(id).orElse(null);
       if (old == null){
           old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
           old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
       }
        journalEntryService.saveEntry(old);
        return old;
    }
}
