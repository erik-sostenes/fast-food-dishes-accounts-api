package com.context.mooc.accounts.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public final class Account {
    private AccountId id;
    private AccountIdentifier identifier;
    private AccountName name;
    private AccountLastName lastName;
    private AccountEmail email;
    private AccountPassword password;
    private AccountRol rol;

    public AccountId id() {
        return id;
    }
    public AccountIdentifier identifier() {
        return identifier;
    }
    public AccountName name() {
        return name;
    }
    public AccountLastName lastName() {
        return lastName;
    }
    public AccountEmail email() {
        return email;
    }
    public AccountPassword password() {
        return password;
    }
    public AccountRol rol() {
        return rol;
    }
}
