package com.example.springboot.persister;

import com.example.springboot.interfece.FilePersister;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryFilePersister implements FilePersister {
    Map<String, String> fileDataBase;

    public InMemoryFilePersister() {
        this.fileDataBase = new HashMap<>();
    }

    @Override
    public void insert(String file, String content) {
        fileDataBase.put(file, content);
    }

    @Override
    public String read(String file) {
        return fileDataBase.get(file);
    }

    @Override
    public void update(String file, String content) {
        fileDataBase.put(file, content);
    }

    @Override
    public void delete(String file) {
        fileDataBase.remove(file);
    }
}
