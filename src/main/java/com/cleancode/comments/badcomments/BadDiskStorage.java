// (c) Alberto Maciques
// Created in 2024
package com.cleancode.comments.badcomments;

/*
*********
 Imports
*********
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BadDiskStorage {
    private final String storageDirectory;

    public BadDiskStorage(String directoryName) {
        this.storageDirectory = directoryName;
    }

    public Path getDirectoryPath() {
        return Paths.get(storageDirectory);
    }

    // This must be called before a file is inserted
    public void createDirectory() {
        if (!Files.exists(getDirectoryPath())) {
            try {
                Files.createDirectories(getDirectoryPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Warning: Directory must exist in advance
    public void insertFile(String fileName, String content) {
        try {
            File file = new File(getDirectoryPath().resolve(fileName).toString());
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
