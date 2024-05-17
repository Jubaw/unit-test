package test2;

import mockito2.UserRepo;
import mockito2.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class TestUserService {

    //getUser metodunu test edelim
    //1-id=1 return:Dear Gökhan
    //2-1 kere getUserName
    //3-id=99 throws:RuntimeException
    @Test
    void testGetUser(){

        UserRepo repo=mock(UserRepo.class);
        when(repo.getUserName(1)).thenReturn("Gökhan");
        when(repo.getUserName(99)).thenReturn(null);

        UserService userService=new UserService(repo);

        //id=1
        String username=userService.getUser(1);

        assertEquals("Dear Gökhan",username);
        verify(repo).getUserName(1);


        //id=99
        assertThrows(RuntimeException.class,()->userService.getUser(99));
        verify(repo).getUserName(99);



    }
}
