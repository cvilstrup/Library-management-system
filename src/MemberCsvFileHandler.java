import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MemberCsvFileHandler {

    private final Path path;
    private MemberCsvMapper mapper;

    public MemberCsvFileHandler(Path path, MemberCsvMapper mapper) {
        this.path = path;
        this.mapper = mapper;
    }

    public List<Member> loadMembers() throws IOException{
        List<Member> members = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while ((line = reader.readLine()) != null){
                members.add(mapper.fromCsv(line));
            }
        }
        return members;
    }
}
