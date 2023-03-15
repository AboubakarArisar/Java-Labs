class Person
{
    private String name,gender;
    private int age;
    Person()
    {
        name = gender = null;
        age = 0;
    }
    Person(String a,String b, int c)
    {
        name = a;
        gender = b;
        age = c;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setGender(String gender)
    {
        this.gender = gender;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    String getName()
    {
        return name;
    }
    String getGender()
    {
        return gender;
    }
    int getAge()
    {
        return age;
    }
    void sayHello()
    {
        String str = getSalutation();
        System.out.println("Greetings to you "+str);
    }
    boolean isAdult()
    {
        if(age<18)
            return false;
        else
            return true;
    }
    String getSalutation()
    {
        if(gender.equals("Male"))
        {
            return "MR." + name ;
        }
        else
            return "MS. " + name;

    }
}
public class practice
{
    public static void main(String args[])
    {
        Person p = new Person();
        p.setName("Aboubakar");
        p.setAge(19);
        p.setGender("Male");
        p.sayHello();
    }
}
