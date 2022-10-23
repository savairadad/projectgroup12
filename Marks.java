package project1;

public abstract class Marks {


    abstract double  getPercentage();


}
class StudentA extends Marks {

    double subject1;
    double subject2;
    double subject3;

    StudentA(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }


    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
    }
class StudentB extends Marks{

    double subject1;
    double subject2;
    double subject3;
    double subject4;
    StudentB(double subject1,double subject2,double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }


    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4;
    }
}
class Maintester{
    public static void main(String[] args) {
Marks [] task={new StudentA(99,88,78),new StudentB(70,76,78,89)};
for(Marks a:task){
    System.out.println("average%"+a.getPercentage());
}
        
    }
}



