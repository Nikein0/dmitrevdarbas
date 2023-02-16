package students.service.impl;

import students.service.StudentRepository;

public class StudentsRepositoryImpl implements StudentRepository {

    @Override
    public int provideStudentsCount() {
        //throw new NullPointerException("");
        return 10;
    }
}
