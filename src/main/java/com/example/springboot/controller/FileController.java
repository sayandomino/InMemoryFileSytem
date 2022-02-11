package com.example.springboot.controller;


import com.example.springboot.dto.File;
import com.example.springboot.dto.FileUpdateRequest;
import com.example.springboot.interfece.FileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileSystem fileSystem;

    @PostMapping("/")
    public ResponseEntity<File> create(@RequestBody File file){

        fileSystem.create(file.getName(), file.getContent());
        return new ResponseEntity<File>(file, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> read(@PathVariable("name") String name, @RequestParam int start, @RequestParam int offset){
        String retrievedValue = fileSystem.read(name, start, offset);
        return new ResponseEntity<String>(retrievedValue, HttpStatus.OK);
    }

    @PutMapping("/{name}")
    public ResponseEntity<File> update(@PathVariable("name") String name, @RequestBody FileUpdateRequest fileUpdateRequest){
        String updatedContent = fileSystem.update(name, fileUpdateRequest);
        return new ResponseEntity<File>(new File(name, updatedContent), HttpStatus.OK);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<String> delete(@PathVariable("name") String name){
        fileSystem.delete(name);
        return new ResponseEntity<String>("File Deletion completed" , HttpStatus.OK);
    }
}
