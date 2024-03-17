package com.cleancode.comments.goodcomments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GoodDiskStorage {

    private final String storageDirectory;

    public GoodDiskStorage(String directoryName) {
        this.storageDirectory = directoryName;
    }

    public Path getDirectoryPath() {
        return Paths.get(storageDirectory);
    }

    public void createDirectory() {
        if (!Files.exists(getDirectoryPath())) {
            try {
                Files.createDirectories(getDirectoryPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertFile(String fileName, String content) {
        try {
            String filePath = getDirectoryPath().resolve(fileName).toString();
            File file = new File(filePath);
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
