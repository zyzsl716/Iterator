import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
  List<College> collegeList;

  public OutPutImpl(List<College> collegeList) {
    this.collegeList = collegeList;
  }

//  遍历所有学院
  public void printCollege() {
    Iterator<College> iterator = collegeList.iterator();
    while (iterator.hasNext()) {
      College college = iterator.next();
      System.out.println("======="+college.getName()+"========");
      printDepartment(college.createIterator());
    }
  }

//输出院系
  public void printDepartment(Iterator iterator) {
    while (iterator.hasNext()) {
      Department department = (Department) iterator.next();
      System.out.println(department.getName());
    }
  }
}
