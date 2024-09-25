//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conifer conifer = new Conifer("prosty", "wąska", "zielona, gruba");
        DeciduousTree deciduousTree = new DeciduousTree("gruby", "rozłożysta", "ciemnozielony, szeroki");

        conifer.doPhotosynthesis();
        conifer.grow();
        conifer.dropNeedles();
        System.out.println();
        deciduousTree.doPhotosynthesis();
        deciduousTree.grow();
        deciduousTree.dropLeaves();
    }
}