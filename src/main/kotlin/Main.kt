import java.io.*
import java.util.*
import chikoplum.*

fun main() {
//    val inputFile: File= File ("C:\\Users\\camila juliao\\IdeaProjects\\Test2\\src\\main\\kotlin\\scratch.xml")
//    val outputFile: File = File ("C:\\Users\\camila juliao")
//    encodeToBinary(inputFile, outputFile)
println("hola camipluna como estas")
    println("te amo mucho")
println("hola")
    println("te amo mas")
}

@Throws(IOException::class)
private fun encodeToBinary(inputPath: File, outputPath: File) {

    // Read all the bytes from the input file
    val inputData: InputStream = FileInputStream(inputPath)
    val fileData = ByteArrayOutputStream()
    inputData.transferTo(fileData)

    // StringJoiner to store binary code(2) encoded
    val binaryData = StringJoiner(" ")

    // Convert every byte into binaryString
    for (data in fileData.toByteArray()) {
        binaryData.add(Integer.toBinaryString(data.toInt()))
    }
    println("")
    // (File)OutputStream for writing binary code(2)
    val outputData: OutputStream = FileOutputStream(outputPath)
    outputData.write(binaryData.toString().encodeToByteArray())

    // [IMPORTANT] Close all the streams
    fileData.close()
    outputData.close()
    inputData.close()
}

