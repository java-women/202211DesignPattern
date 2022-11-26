package bridge.Animal;

public class CatImpl extends AnimalImpl{
    @Override
    public String bark() {
        return "にゃ〜";
    }

    @Override
    public String sit() {
        return "↓";
    }

    @Override
    public String run() {
        return "→↑→";
    }
}
