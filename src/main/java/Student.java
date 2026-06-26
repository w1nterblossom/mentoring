public class Student {
    String name;
    int age;
    String major;

    public Student(String name, int age, String major) {

        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void introduce() {
        System.out.println("==== 학생 정보====");
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println("전공 :" + major);
        System.out.println();
        if (age >= 20) System.out.println("성인 학생입니다.");

        else {
            System.out.println("미성년 학생입니다.");
        }
    }

    public void study() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(name + "가 공부를 시작합니다.");
        }
    }


}