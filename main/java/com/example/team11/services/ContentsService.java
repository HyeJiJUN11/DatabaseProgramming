package com.example.team11.services;

import com.example.team11.entities.Contents;
import com.example.team11.repositories.ContentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentsService {
    private final ContentsRepository contentsRepository;

    @Autowired
    public ContentsService(ContentsRepository contentsRepository) {
        this.contentsRepository = contentsRepository;
    }

    public void saveContents(Contents contents) {
        contentsRepository.save(contents);
    }
}

