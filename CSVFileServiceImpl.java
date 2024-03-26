import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CSVFileServiceImpl implements FileService {
  public void read(String filePath) {
    BufferedReader reader = null;
    String line = "";

    try {
      reader = new BufferedReader(new FileReader(filePath));

      while ((line = reader.readLine()) != null) {
        String[] rows = line.split(",");
        Student stu = new Student();
        int id = 0;
        try {
          id = Integer.parseInt(rows[0]);
        } catch (Exception e) {
          continue;
        }
        stu.setId(id);
        stu.setName(rows[1]);
        stu.setNationality(rows[2]);
        stu.setCity(rows[3]);
        stu.setLatitude(rows[4]);
        stu.setLongitude(rows[5]);
        stu.setGender(rows[6]);
        stu.setAge(rows[8]);
        System.out.println(stu);
      }

      reader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch(NumberFormatException e){
      e.printStackTrace();
    }
  }
}
