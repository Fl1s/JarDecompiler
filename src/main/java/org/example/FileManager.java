package org.example;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FileManager {
    public void createDirectory(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    public List<String> listFiles(String baseDir) {
        List<String> fileList = new ArrayList<>();
        listFilesRecursively(new File(baseDir), fileList, baseDir);
        return fileList;
    }

    private void listFilesRecursively(File directory, List<String> fileList, String baseDir) {
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                fileList.add(Paths.get(baseDir).relativize(file.toPath()).toString());
            } else if (file.isDirectory()) {
                listFilesRecursively(file, fileList, baseDir);
            }
        }
    }
}
