public class Flower {
    import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

    @Getter
    @Setter
    @ToString

    public class Flower {
        String name;
        int cost;

        public Flower(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }

}
