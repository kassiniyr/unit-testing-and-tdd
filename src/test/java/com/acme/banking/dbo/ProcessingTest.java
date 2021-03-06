package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Account;
import com.acme.banking.dbo.domain.SavingAccount;
import com.acme.banking.dbo.service.Processing;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ProcessingTest {
    @Test @Ignore
    public void shouldWithdrawAndDepositWhenTransfer() {
        final Processing sut = new Processing();
        final Account fromAccountMock = mock(Account.class);
        final Account toAccountMock = mock(Account.class);
//  //      when(toAccountMock.getId()).thenThrow(new IllegalStateException());

        sut.transfer(1., fromAccountMock, toAccountMock);

        verify(fromAccountMock, times(1)).withdraw(1.);
        verify(toAccountMock).deposit(anyDouble());
    }
}