package org.lukasz.succes;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sciezki {
    public static void main(String[] args) throws IOException {
        Path cwdRl = Paths.get("");

        Path cwdAbs = cwdRl.toAbsolutePath();
        System.out.println("sciezka: [" + cwdRl + "]");
        System.out.println("sciezka: [" + cwdAbs + "]");
//        String[] more = {"src" , "main"};
//        Paths.get("",more);
        Paths.get("", "src", "main");
        Path path = Paths.get("src/main/java/org/lukasz/succes/App.java");
        System.out.println(path);
        Path path1 = path.toAbsolutePath();
        System.out.println(path1);

        Path katalogKodu = Paths.get("src/main/java").resolve("org/lukasz/succes/App.java");
        Path plikZrodlowy = katalogKodu.resolve("org/lukasz/succes/App.java");
        Path parent = plikZrodlowy.getParent();
        System.out.println(parent);
        System.out.println(parent.toAbsolutePath().getRoot());
        System.out.println(plikZrodlowy.getFileName());
        System.out.println(Files.exists(plikZrodlowy));

        Path testdir = Paths.get("testdir");
        if (!Files.exists(testdir)) {
            Files.createFile(testdir);

        }

        Path kolejnyKatalog = testdir.resolve("banan/kwiecien");
        Files.createDirectories(kolejnyKatalog);

        Path plik = kolejnyKatalog.resolve("help.txt");
        if (!Files.exists(plik)) {
            Files.createFile(plik);
        }
        Path plik2 = plik.resolveSibling("jejku.txt");
        if (!Files.exists(plik2)) {
            Files.copy(plik, plik2);

        }
        Path plik3 = plik2.resolveSibling("zaraza.txt");
        if (!Files.exists(plik3)) {
            Files.move(plik2, plik3);
        }
        Files.delete(plik);
        Files.deleteIfExists(plik2);
        Files.delete(plik3);


        DirectoryStream<Path> zawartosc = Files.newDirectoryStream(testdir);
        for (Path p : zawartosc) {
            System.out.println(p);
        }
        delete(testdir);

    }
    public static void delete(Path path) throws IOException {
        if (Files.exists(path)) {
            if (Files.isRegularFile(path)) {
                System.out.println("removing " + path);
                Files.delete(path);
            } else if (Files.isDirectory(path)) {
                System.out.println("removing children of " + path);
                for (Path child : Files.newDirectoryStream(path)) {
                    delete(child);
                }
                System.out.println("removing " + path);
                Files.delete(path);
            } else {
                throw new RuntimeException();
            }
        }
    }

}




