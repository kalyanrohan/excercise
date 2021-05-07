public class Teacher extends Person{
    private int numCourses=0;
    private String courses[];

    public Teacher(String name,String address){
        this.setAddress(address);
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Teacher: "+this.getName()+" ("+this.getAddress()+")";
    }

    public boolean addCourse(String course){
        for(int i=0;i<numCourses;i++){
            if(courses[i]==course){
                return Boolean.FALSE;
            }
            else{
                courses[numCourses]=course;
                numCourses++;
                return Boolean.TRUE;
            }
        }
    }

    public boolean removeCourse(String course){
        for(int i=0;i<numCourses;i++){
            if(courses[i]==course){
                courses.;
            }
            else{
                return Boolean.FALSE;
            }
        }
    }
}
