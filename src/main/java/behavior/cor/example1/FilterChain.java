package behavior.cor.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName FilterChain
 * @Date 2023/9/5 16:37
 * @Description TODO
 */
public class FilterChain implements SchoolFilter {
    private int filterPos = 0;

    private School school;

    private List<SchoolFilter> filterList;

    public void addFilter(SchoolFilter filter) {
        if (filterList == null) {
            filterList = new ArrayList<>();
        }
        filterList.add(filter);
    }

    @Override
    public void doFilter(Preparations preparations, FilterChain filterChain) {
        if (filterPos == filterList.size()) {
            school.study();
            return;
        }
        filterList.get(filterPos++).doFilter(preparations, filterChain);
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
