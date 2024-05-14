package implementations;

public class Document {
    int id;
    String content;
    double score;

    public Document(int id, String content) {
        this.id = id;
        this.content = content;
        this.score = 0.0;
    }
}
