import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.ISysUserService;
import com.zking.ssm.services.impl.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class SysUserServiceImplTest extends BaseTestCase {

    @Autowired
    private ISysUserService userService;

    private sysUser user;

    @Before
    public void setUp() throws Exception {
        user=new sysUser();
    }

    @Test
    public void doRegister() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void getUser() {
    }

    @Test
    public void getListUser() {
    }
}