import java.util.*;

public class Any_Base_To_Any_Base {
    // TO convert any base to any base we need to follow a specific method but
    // instead of remenbering all of that we frist conver the b1 base to 10 base and
    // then that converted base 10 to b2 base so as to avid any remembring of stuff
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        scn.close();
    }
}
