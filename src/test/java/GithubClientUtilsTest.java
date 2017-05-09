import com.srikanth.model.Commit;
import com.srikanth.utils.GithubClientUtils;
import org.junit.Test;

import java.util.List;

public class GithubClientUtilsTest {

    GithubClientUtils test = new GithubClientUtils();

    Commit commit = new Commit();
    @Test
    public void getCommitsTest(){
        int list= test.getCommits("shrimanoz","github-dashboard");

        System.out.println(list);

    }
}
