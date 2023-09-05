package behavior.cor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Main
 * @Date 2023/9/5 16:47
 * @Description TODO
 */
public class Main {
    public static void main(String[] args) {
        Preparations preparations = new Preparations();
        preparations.setBrushTooth(true);
        preparations.setWashFace(true);
        preparations.setDressed(true);

        School school = new School();

        BrushToothFilter brushToothFilter = new BrushToothFilter();
        WashFaceFilter washFaceFilter = new WashFaceFilter();
        DressedFilter dressedFilter = new DressedFilter();

        FilterChain chain = new FilterChain();
        chain.addFilter(brushToothFilter);
        chain.addFilter(washFaceFilter);
        chain.addFilter(dressedFilter);
        chain.setSchool(school);

        chain.doFilter(preparations, chain);
    }
}
