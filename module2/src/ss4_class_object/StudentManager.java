package ss4_class_object;

public class StudentManager {
    private Student[] studentList = new Student[100];

    public void showList() {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i].getInfo());
            } else {
                break;
            }
        }
    }

    public void add(Student student) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                return;
            }
        }
        System.out.println("Danh sách đã đầy, không thể thêm!");
    }

    public boolean deleteById(int id) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentList[i].getId() == id) {
                // dồn mảng sang trái
                for (int j = i; j < studentList.length - 1; j++) {
                    studentList[j] = studentList[j + 1];
                }
                studentList[studentList.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public void search(String searchName) {
        boolean found = false;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null
                    && studentList[i].getName().toLowerCase()
                    .contains(searchName.toLowerCase())) {
                System.out.println(studentList[i].getInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên: " + searchName);
        }
    }
}