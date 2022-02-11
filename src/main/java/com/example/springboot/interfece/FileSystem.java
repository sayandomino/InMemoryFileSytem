package com.example.springboot.interfece;

import com.example.springboot.dto.FileUpdateRequest;

public interface FileSystem {
    void create(String name, String content);
    String read(String name, int startPosition, int n);
    String update(String name, FileUpdateRequest fileUpdateRequest);
    void delete(String name);
}
