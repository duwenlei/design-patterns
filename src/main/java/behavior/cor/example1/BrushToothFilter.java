package behavior.cor.example1;

/**
 * 刷牙
 *
 * @author duwenlei
 * @version 1.0
 * @ClassName BrushToothFilter
 * @Date 2023/9/5 16:43
 * @Description TODO
 */
public class BrushToothFilter implements SchoolFilter {
    @Override
    public void doFilter(Preparations preparations, FilterChain filterChain) {
        if (preparations.isBrushTooth()) {
            System.out.println("已经刷牙");
        }
        filterChain.doFilter(preparations, filterChain);
    }
}
