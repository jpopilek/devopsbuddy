package com.devopsbuddy.test.integration;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.devopsbuddy.DevopsbuddyApplication;
import com.devopsbuddy.backend.persistence.domain.backend.User;

/**
 * Created by tedonema on 30/03/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DevopsbuddyApplication.class)
public class UserServiceIntegrationTest extends AbstractServiceIntegrationTest {

  @Rule
  public TestName testName = new TestName();

  @Test
  public void testCreateNewUser() throws Exception {

    User user = createUser(testName);
    Assert.assertNotNull(user);
    Assert.assertNotNull(user.getId());

  }

}