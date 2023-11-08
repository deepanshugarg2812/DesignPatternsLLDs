package com.compositedesignpattern;

public class Main {
    public static void main(String[] args) {
        Directory fs = new Directory("Root");
        fs.add(new File("child1"));
        fs.add(new File("child2"));
        fs.add(new File("child3"));
        fs.add(new File("child4"));
        Directory child5 = new Directory("child5");
        child5.add(new File("sample"));
        fs.add(child5);
        fs.ls();
    }
}
