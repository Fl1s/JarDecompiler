package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class Extractor {
    public void extractJar(String jarPath, String extractDir) {
        try (ZipFile jar = new ZipFile(jarPath)) {
            Enumeration<? extends ZipEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                File entryDestination = new File(extractDir, entry.getName());
                if (entry.isDirectory()) {
                    entryDestination.mkdirs();
                } else {
                    entryDestination.getParentFile().mkdirs();
                    Files.copy(jar.getInputStream(entry), entryDestination.toPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
