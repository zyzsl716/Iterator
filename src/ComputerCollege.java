import java.util.Iterator;

public class ComputerCollege implements College{
  Department[] departments;
  int numOfDepartment = 0;
  @Override
  public String getName() {
    return "计算机科学学院";
  }

  public ComputerCollege() {
    departments = new Department[5];
    addDepartment("Java专业","Java专业");
    addDepartment("大数据专业","大数据专业");
    addDepartment("网络安全专业","网络安全专业");
  }

  @Override
  public void addDepartment(String name, String des) {
    Department department = new Department(name,des);
    departments[numOfDepartment] = department;
    numOfDepartment += 1;
  }

  @Override
  public Iterator createIterator() {
    return new ComputerCollegeInterator(departments);
  }
}
