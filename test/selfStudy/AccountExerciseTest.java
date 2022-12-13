package selfStudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountExerciseTest {

    @Test
    public void depositTest() {
        AccountExercise folaAccount = new AccountExercise();
        folaAccount.deposit(5000);
        int folaAccountBalance = folaAccount.getBalance();
        assertEquals(5000, folaAccountBalance);
        }

    @Test
    public void transferTwiceTest() {
        AccountExercise folaAccount = new AccountExercise();
        AccountExercise damianAccount = new AccountExercise();
        damianAccount.transfer(2000);
        AccountExercise yinkaAccount = new AccountExercise();
        yinkaAccount.transfer(3000);
        int folaAccountBalance = folaAccount.getBalance();
        assertEquals(0, folaAccount.getBalance());
        }
    }