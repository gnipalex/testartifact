package org.github.hnyp.testartifact;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.util.Arrays.asList;

public class TestCreatingArtifact {

    @Test
    public void generate_artifacts() throws IOException {
        Path outputArtifactDir = Paths.get(".", "target/artifacts");
        Files.createDirectories(outputArtifactDir);
        Path outputArtifact = Paths.get(outputArtifactDir.toString(), "current-date.txt");
        if (Files.notExists(outputArtifact)) {
            Files.createFile(outputArtifact);
        }

        Files.write(outputArtifact, asList("Current date is " + new Date()), TRUNCATE_EXISTING);
    }

}
