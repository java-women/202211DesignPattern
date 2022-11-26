package bridge.Animal;

public class DogImpl extends AnimalImpl{

    @Override
    public String bark() {
        return "わん！";
    }

    @Override
    public String sit() {
        return "↓";
    }

    @Override
    public String run() {
        return "→→→";
    }
}
