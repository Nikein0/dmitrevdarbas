package org.example;

import students.service.impl.StudentsRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentsRepositoryImplTest {

    private StudentsRepositoryImpl repository = new StudentsRepositoryImpl();
    @Before
    public void setUp() throws Exception {
        System.out.println("Calling before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Calling after");
    }

    @Test
    public void provideStudentsCount() {
        System.out.println("Calling test");
        int count = repository.provideStudentsCount();
        Assert.assertEquals(10, count);
    }
}