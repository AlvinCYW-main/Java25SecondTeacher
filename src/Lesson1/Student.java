package Lesson1;

public class Student {
    private int score1;
    private int score2;
    private String teacherAccount;

    public Student(String teacher) {
        this.teacherAccount = teacher;
    }

    public int getScore1(String teacher){
        if (teacher != this.teacherAccount){
            System.out.println("Wrong account!");
            return -1;
        } else {
            return this.score1;
        }
    }

    public int getScore2(String teacher){
        if (teacher != this.teacherAccount){
            System.out.println("Wrong account!");
            return -1;
        } else {
            return this.score2;
        }
    }

    public void setScore1(int scoreIn, String teacher) {
        if(teacher == this.teacherAccount){
            if(scoreIn >= 0 && scoreIn <= 100){
                this.score1 = scoreIn;
            } else {
                System.out.println("The score should be between 0 and 100");
            }
        } else {
            System.out.println("Wrong account!");
        }       
    }

    public void setScore2(int scoreIn, String teacher) {
        if(teacher == this.teacherAccount){
            if(scoreIn >= 0 && scoreIn <= 100){
                this.score2 = scoreIn;
            } else {
                System.out.println("The score should be between 0 and 100");
            }
        } else {
            System.out.println("Wrong account!");
        }            
    }

 
    public void setTeacherAccunt(String teacher) {
        this.teacherAccount = teacher;
    }
    
}
