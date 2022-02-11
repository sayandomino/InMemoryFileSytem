package com.example.springboot.interfece;

public interface FilePersister {
    void insert(String file, String content);
    String read(String file);
    void update(String file, String content);
    void delete(String file);
}
