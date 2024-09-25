import lombok.Getter;

@Getter
public class DeciduousTree extends Tree {
    private final String leaf;

    public DeciduousTree(String trunk, String branch, String leaf) {
        super(trunk, branch);
        this.leaf = leaf;
    }

    @Override
    public void grow() {
        System.out.println("Rośnie drzewo liściaste, pojawiły się liście o typie: " + leaf);
    }

    public void dropLeaves() {
        System.out.println("Drzewo liściaste zrzuca liście. ");
    }
}
