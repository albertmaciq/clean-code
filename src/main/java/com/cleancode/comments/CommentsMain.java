package com.cleancode.comments;

import com.cleancode.comments.goodcomments.GoodDiskStorage;

public class CommentsMain {

    public static void main(String[] args) {
        GoodDiskStorage logStorage = new GoodDiskStorage("logs");
        logStorage.createDirectory();
        logStorage.insertFile("test.txt", "Test");
    }
}
