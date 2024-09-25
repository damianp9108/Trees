import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Tree {
    private String trunk;
    private String branch;

    public void doPhotosynthesis() {
        System.out.println("Trwa proces fotosyntezy.");
    }

    public abstract void grow();
}
