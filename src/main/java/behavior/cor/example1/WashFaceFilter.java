package behavior.cor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName WashFaceFilter
 * @Date 2023/9/5 16:45
 * @Description TODO
 */
public class WashFaceFilter implements SchoolFilter {
    @Override
    public void doFilter(Preparations preparations, FilterChain filterChain) {
        if (preparations.isWashFace()) {
            System.out.println("已经洗脸");
        }
        filterChain.doFilter(preparations, filterChain);
    }
}
