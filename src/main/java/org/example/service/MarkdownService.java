package org.example.service;

import org.example.user.Project;
import org.example.user.Todo;

import java.io.FileWriter;
import java.io.IOException;

public class MarkdownService {
    public void exportProjectToMarkdown(Project project) throws IOException {
        String fileName = "project_" + project.getId() + ".md";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("# " + project.getTitle() + "\n");
            writer.write("Created: " + project.getCreatedDate() + "\n\n");

            writer.write("## Todos\n");
            for (Todo todo : project.getTodos()) {
                writer.write("- " + todo.getDescription() + " (" + todo.getStatus() + ")\n");
            }
        }
    }
}
