import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollegeInterator implements Iterator {
  List<Department> departmentList;
  int index = -1;

  public InfoCollegeInterator(List<Department> departmentList) {
    this.departmentList = departmentList;
  }

  @Override
  public boolean hasNext() {
    if (index >= departmentList.size() -1) {
      return false;
    }else {
      index += 1;
      return true;
    }

  }

  @Override
  public Object next() {
    return departmentList.get(index);
  }
}
