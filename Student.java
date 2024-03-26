class Student {
  private int id;
  private String name;
  private String nationality;
  private String city;
  private String latitude;
  private String longitude;
  private String gender;
  private String age;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getNationality() {
    return nationality;
  }
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }
  
  @Override
  public String toString() {
    return "ID: " + id + " Name: " + name + " Nationality: " + nationality + " City: " + city + " Lat: " + latitude + " Lng: " + longitude + " Gender: " + gender + " Age: " + age;
  }
}