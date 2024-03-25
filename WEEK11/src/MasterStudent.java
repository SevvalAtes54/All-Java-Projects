abstract class MasterStudent extends Student implements ProjectScoreBehaviour {
    private int numberOfConf;

    public MasterStudent(int id, float mid, float fin, int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore() + conferenceScore() + projectScore();
    }

    @Override
    float computeBaseScore() {
        return (getMid() + getFin()) / 2; // Accessing mid and fin using getters
    }

    @Override
    public float projectScore() {
        return 0.0f; // Placeholder value
    }

    @Override
    public float conferenceScore() {
        return 0.0f; // Placeholder value

    }
}