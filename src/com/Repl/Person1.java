package com.Repl;

public class Person1 {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person1(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public String formatBirthday(){

        return getBirthmonth()+"/"+getBirthday()+"/"+getBirthyear();
    }
}
