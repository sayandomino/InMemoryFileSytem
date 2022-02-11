package com.example.springboot.dto;

public class FileReadBody {
    private int startPoint;
    private int readLength;

    public FileReadBody(int startPoint, int readLength) {
        this.startPoint = startPoint;
        this.readLength = readLength;
    }
}
