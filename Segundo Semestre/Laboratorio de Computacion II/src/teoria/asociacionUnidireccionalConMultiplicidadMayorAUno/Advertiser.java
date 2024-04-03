package teoria.asociacionUnidireccionalConMultiplicidadMayorAUno;

import java.util.HashSet;
import java.util.Set;

public class Advertiser {
    private Set<Account> accounts;

    public Advertiser() {
        accounts = new HashSet<>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
        a.setOwner(null);
    }

    public void removeAccount(Account a) {
        accounts.remove(a);
        a.setOwner(null);
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
