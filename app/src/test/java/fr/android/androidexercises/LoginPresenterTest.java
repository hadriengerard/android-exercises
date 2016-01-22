package fr.android.androidexercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by hadri on 22/01/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    LoginActivity activity;
    @InjectMocks
    LoginPresenter loginPresenter;

    @Test
    public void testCheckCredentials() throws Exception {
        // When
        loginPresenter.checkCredentials("password");
        // Then
        Mockito.verify(activity).logged();
        Mockito.verify(activity).message(R.string.text_logged);
    }

    @Test
    public void testCheckWrongCredentials() throws Exception {
        // When
        loginPresenter.checkCredentials("ab");
        // Then
        Mockito.verify(activity).notLogged();
        Mockito.verify(activity).message(R.string.notLogged);
    }

}