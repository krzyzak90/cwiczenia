package org.lukasz.succes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Zadanie {
    public static void main(String[] args) throws IOException {

        int yy = LocalDate.now().getYear();
        for (int mm = 1; mm < 13; mm++) {
            String miesiac = String.format("%02d", mm);
            Path folder = Paths.get("testMiesiace", yy + "-" + miesiac);
            if (!Files.exists(folder)) {
                Files.createDirectories(folder);
            }
            Path plikKalendarz = folder.resolve(yy + "-" + miesiac + ".txt");
            if (!Files.exists(plikKalendarz)) {
                Files.createFile(plikKalendarz);
            }
            LocalDate pierwszyDzienMiesiaca = LocalDate.of(yy, mm, 1);
            LocalDate pierwszyDzienMiesiacaNastepnego = pierwszyDzienMiesiaca.plusMonths(1);
            LocalDate ostatniDzienMiesiaca = pierwszyDzienMiesiacaNastepnego.plusDays(-1);
            DayOfWeek dzienTyg = pierwszyDzienMiesiaca.getDayOfWeek();
            int nrDzienTyg = dzienTyg.getValue();
            int dlugoscTablicy = ostatniDzienMiesiaca.getDayOfMonth() + nrDzienTyg;
            String[] tablica = new String[dlugoscTablicy];
            int n = 1;
            for (int x = 0; x < dlugoscTablicy; x++) {
                if (x < nrDzienTyg) {
                    tablica[x] = "  ";
                } else {
                    tablica[x] = String.format("%02d", n++);
                }
            }
//drukowanie kalendarza
            BufferedWriter writer = Files.newBufferedWriter(plikKalendarz);
            writer.write("PN WT SR CZ PT SO ND");
            for (int x = 0; x < dlugoscTablicy; x++) {
                writer.write(tablica[x] + " ");
                if (x % 7 == 0) {
                    writer.write("\n");
                }
            }
            writer.close();
        }
    }
}
