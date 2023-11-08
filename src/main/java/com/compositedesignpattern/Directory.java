package com.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String name;
    List<FileSystem> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem){
        files.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("File name is " + name);
        for(FileSystem x : files){
            x.ls();
        }
    }
}
