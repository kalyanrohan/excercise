public abstract class Person implements Behaviour{

    private String name;
    private String gender;

    public Person(String nm, String gen){
        this.name=nm;
        this.gender=gen;
    }

    public abstract void work();
    public void changeName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void breath() {
        System.out.println(getName()+" breathing");
    }


    public void eat(){
        System.out.println(getName()+" eating");
    }

}
