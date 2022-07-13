import java.io.*;
import java.util.StringJoiner;


public class chikoplum {
    public void encodeToBinary(File inputPath, File outputPath) throws IOException {

        // Read all the bytes from the input file

        InputStream inputData = new FileInputStream(inputPath);
        ByteArrayOutputStream fileData = new ByteArrayOutputStream();
        inputData.transferTo(fileData);

        // StringJoiner to store binary code(2) encoded

        StringJoiner binaryData = new StringJoiner(" ");

        // Convert every byte into binaryString

        for (Byte data : fileData.toByteArray()) {
            binaryData.add(Integer.toBinaryString(data));
        }

        // (File)OutputStream for writing binary code(2)

        OutputStream outputData = new FileOutputStream(outputPath);
        outputData.write(binaryData.toString().getBytes());

        // [IMPORTANT] Close all the streams

        fileData.close();
        outputData.close();
        inputData.close();
    }
}