
class PhDStudent extends Student {
    private int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int numberOfArticles) {
        super(id, mid, fin);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore() + articleScore();
    }

    @Override
    float computeBaseScore() {
        return (mid + fin) / 2;
    }

    @Override
    public float articleScore() {
        return 0.0f; // Placeholder value
    }

    @Override
    public float conferenceScore() {
        return 0.0f; // Placeholder value
    }
}

abstract class Student implements ConferenceScoreBehaviour, ArticleScoreBehaviour {
     int id;
     float mid;
     float fin;

    public Student(int id, float mid, float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;


    }


    public float getMid() {
        return mid;
    }

    public float getFin() {
        return fin;
    }
    public abstract float computeTotalScore();

    abstract float computeBaseScore();
}





