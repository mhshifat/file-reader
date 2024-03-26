public class Main {
  public static void main(String[] args) {
    String filePath = "student-dataset.csv";
    FileService fileService = new FileServiceStrategy();
    fileService.read(filePath);
  }
}
