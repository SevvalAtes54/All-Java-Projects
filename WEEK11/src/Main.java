public class Main {
    public static void main(String[] args) {


                BachelorStudent bachelorStudent = new BachelorStudent(201, 75.2f, 82.7f);
                PhDStudent phdStudent = new PhDStudent(301, 90.0f, 87.5f, 4);

                float bachelorTotalScore = bachelorStudent.computeTotalScore();
                float phdTotalScore = phdStudent.computeTotalScore();


                System.out.println("Bachelor Student Total Score: " + bachelorTotalScore);
                System.out.println("PhD Student Total Score: " + phdTotalScore);
            }
        }


