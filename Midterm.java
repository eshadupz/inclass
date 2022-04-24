public class Midterm implements Measurable {
    private double score;
    private String name;


    public Midterm(double classScore, String myName)
    {
        score = classScore;
        name = myName;
    }


    public double getScore()
    {
        return score;
    }


    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Midterm[name=" + name + " score=" + score + "]";
    }
}
