package com.storeware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static com.storeware.Main.FILE_DIRECTORY;

public class FileReaderTest {

    @Test
    public void ShouldReturnValidStringIfFileNameIsCorrect() throws FileNotFoundException {
        //given
        String filePath = FILE_DIRECTORY + "calculate_1.txt";
        //when
        String expectedValue = """
                add 2
                multiply 3
                apply 10
                """;
        String returnValue = FileReader.readFileToMakeCalculation(filePath);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }

    @Test
    public void shouldThrowExceptionIfFileIsIncorrect() {
        //given
        String nonExistingFilePath = FILE_DIRECTORY + "non_exist.txt";
        //then
        Assertions.assertThrows(FileNotFoundException.class, () -> FileReader.readFileToMakeCalculation(nonExistingFilePath));
    }
}
