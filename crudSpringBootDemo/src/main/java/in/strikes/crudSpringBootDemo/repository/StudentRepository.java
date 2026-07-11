package in.strikes.crudSpringBootDemo.repository;

import in.strikes.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq){
        //save to DB
        Student s1 = new Student();
        s1.setName("Ashmit");
        s1.setAge(21);
        s1.setEmail("ashmit.rana2019@gmail.com");
        s1.setRollNo(101);
        s1.setSubject("Spring Framework");
        return s1;
    }
}
