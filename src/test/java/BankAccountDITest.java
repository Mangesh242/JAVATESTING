import org.example.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {
//    @Test
    @RepeatedTest(5)
    @DisplayName("Deposit 500 successfully")
    public void testDeposit(BankAccount bankAccount) {
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }
    @ParameterizedTest
    @ValueSource(ints = {500, 100})
    @DisplayName("Deposit 500 successfully")
    public void testDepositPT(int amount,BankAccount bankAccount) {
        bankAccount.deposit(amount);
        assertEquals(amount,bankAccount.getBalance());
    }
}
