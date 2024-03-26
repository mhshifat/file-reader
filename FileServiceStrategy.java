class FileServiceStrategy implements FileService {
  public void read(String path) {
    String[] splitted = path.split("\\.");
    String ext = splitted[splitted.length - 1];
    FileService fileSer = null;
    if (ext.equals("csv")) fileSer = new CSVFileServiceImpl();
    fileSer.read(path);
  }
}
