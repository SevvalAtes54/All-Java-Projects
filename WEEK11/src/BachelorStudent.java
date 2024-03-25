class BachelorStudent extends Student {
    public BachelorStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore();
    }

    @Override
    float computeBaseScore() {
        return (mid + fin) / 2;
    }

    @Override
    public float conferenceScore() {
        return 0.0f; // BachelorStudent does not implement this
    }

    @Override
    public float articleScore() {
        return 0.0f; // BachelorStudent does not implement this
    }
}
