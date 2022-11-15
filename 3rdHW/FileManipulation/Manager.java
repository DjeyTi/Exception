package FileManipulation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager implements Adder {
    FileReader file;

    public Manager(FileReader file) {
        this.file = file;
    }

    @Override
    public void addInfo(NewClass info) throws IOException {
        List<String> fileInfo = file.FileRead();
        try (FileWriter writer = new FileWriter(file.path)) {
            for (String str: fileInfo) {
                writer.write(str + "\n");
            }
            writer.write(info.Name + " " + info.secondName + " " + info.fatherName + " " + info.DoB 
                         + " " + info.Number + " " + info.Sex + "\n");
        }
    }
}

interface Adder {
    void addInfo(NewClass info) throws IOException;
}
