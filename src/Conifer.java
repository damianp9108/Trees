import lombok.Getter;

@Getter
public class Conifer extends Tree {
    private final String needle;

    public Conifer(String trunk, String branch, String needle) {
        super(trunk, branch);
        this.needle = needle;
    }

    @Override
    public void grow() {
        System.out.println("Rośnie drzewo iglaste, pojawiły się igły o typie: " + needle);
    }

    public void dropNeedles() {
        System.out.println("Drzewo iglaste zrzuca igły.");
    }
}
