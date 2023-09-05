package behavior.cor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName DressedFilter
 * @Date 2023/9/5 16:46
 * @Description TODO
 */
public class DressedFilter implements SchoolFilter {
    @Override
    public void doFilter(Preparations preparations, FilterChain filterChain) {
        if (preparations.isDressed()) {
            System.out.println("已经穿上衣服");
        }
        filterChain.doFilter(preparations, filterChain);
    }
}
