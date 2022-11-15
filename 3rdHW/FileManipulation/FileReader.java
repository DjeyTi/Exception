package FileManipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader extends File {
    public FileReader(String path) {
        super.path = path;
    }

    @Override
    public List<String> FileRead() throws IOException {
        List<String> list = Files.readAllLines(Path.of(super.path));
        return list;
    }
}

abstract class File implements Reader{
    String path;
}

interface Reader {
    List<String> FileRead() throws IOException;    
}