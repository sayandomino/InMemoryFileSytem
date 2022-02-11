package com.example.springboot.service;

import com.example.springboot.dto.FileUpdateRequest;
import com.example.springboot.interfece.FilePersister;
import com.example.springboot.interfece.FileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InMemoryFileSystem implements FileSystem {

    @Autowired
    private FilePersister filePersister;

    @Override
    public void create(String name, String content) {
        filePersister.insert(name, content);
    }

    @Override
    public String read(String name, int startPosition, int n) {
        String retrievedContent =  filePersister.read(name);
        return retrievedContent.substring(startPosition, startPosition+n);
    }

    @Override
    public String update(String name, FileUpdateRequest fileUpdateRequest) {

        String currentContent = filePersister.read(name);
        String updatedContent = fileUpdateRequest.getIsAppend()?currentContent + fileUpdateRequest.getContent() : fileUpdateRequest.getContent();

        filePersister.update(name, updatedContent);

        return updatedContent;

    }

    @Override
    public void delete(String name) {
        filePersister.delete(name);
    }
}
