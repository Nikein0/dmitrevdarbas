package students.model;

import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String code;
    private Account account;
    private List<Subject> subjects;

    public Student(int id, String firstname, String lastname, String code, Account account, List<Subject> subjects){
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.code = code;
        this.account = account;
        this.subjects = subjects;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
