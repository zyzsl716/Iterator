import java.util.Iterator;

public class ComputerCollegeInterator implements Iterator {
   Department[] departments;
   int position = 0;

  public ComputerCollegeInterator(Department[] departments) {
    this.departments = departments;
  }

  @Override
  public boolean hasNext() {
    if (position >= departments.length || departments[position] == null) {
      return false;
    }else {
      return true;
    }
  }

  @Override
  public Object next() {
    Department department = departments[position];
    position += 1;
    return department;
  }
}
