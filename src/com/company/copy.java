package com.company;

/**
 * Created by ahmad on 20-Oct-15.
 */


import java.io.IOException;
import java.nio.file.*;

public class copy {

    Path sourcePath = Paths.get("C:\\Users\\ahmad\\Desktop\\test\\Health Belief Model.docx");
    Path destinationPath = Paths.get("C:\\Users\\ahmad\\Desktop\\test2\\Health Belief Model.docx");

    public void copyD() {
        try {
            Files.copy(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            //destination file already exists
        } catch (IOException e) {
            //something else went wrong
            e.printStackTrace();
        }
    }

}
