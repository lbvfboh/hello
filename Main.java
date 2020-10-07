package com.company;

public class Main {

    public static class Employee {
        private final String fullName;
        private final String post;
        private final String email;
        private final String phoneNumber;
        private final int salary;
        private final int age;

        public Employee(String fullName, String post, String email, String phoneNumber, int salary, int age) {
            this.fullName = fullName;
            this.post = post;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void info() {
            System.out.println("Full name: " + fullName + "\n" + "Post: " + post +
                    "\n" + "Email: " + email + "\n" + "Phone number: " + phoneNumber +
                    "\n" + "Salary: " + salary + "\n" + "Age: " + age + "\n");
        }
    }
        public static void main(String[] args) {
            Employee[] employee = new Employee[5];
            employee[0]=new Employee("Петров Дмитрий Евгеньевич", "Junior Java Developer",
                    "snejkov@gmail.com", "89107458134", 35000, 23 );
            employee[1]=new Employee("Трофим Владислав Александрович", "Web designer",
                    "horek@mail.ru", "89105486735", 60000, 41 );
            employee[2]=new Employee("Руссакова Вероника Васильевна", "Middle Java Developer",
                    "sova0_0@yandex.ru", "89621200357", 70000, 24 );
            employee[3]=new Employee("Ковалев Илья Петрович", "Software Tester",
                    "makar@gmail.com", "89035178587", 25000, 31 );
            employee[4]=new Employee("Кравцов Анатолий Михайлович", "Senior Android Developer",
                    "i'm_the_boss@gmail.com", "89107435634", 150000, 43 );

            for (Employee value : employee) {
                if (value.getAge() > 40) value.info();
            }
        }
    }
