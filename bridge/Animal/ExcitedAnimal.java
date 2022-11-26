package bridge.Animal;

public class ExcitedAnimal extends Animal{

    public ExcitedAnimal(AnimalImpl impl) {
        super(impl);
    }

    public String excited(int level) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            builder.append(bark());
        }
        if (level < 5) {
            builder.append(sit());
        } else {
            builder.append(run());
        }
        return builder.toString();
    }
}
