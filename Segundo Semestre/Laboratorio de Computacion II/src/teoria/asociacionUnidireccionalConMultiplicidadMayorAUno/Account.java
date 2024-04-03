package teoria.asociacionUnidireccionalConMultiplicidadMayorAUno;

public class Account {
    private Advertiser owner;

    public void setOwner(Advertiser newOwner) {
        if (owner != newOwner) {
            Advertiser old = owner;
            owner = newOwner;
            if (newOwner != null)
                newOwner.addAccount(this);
            if (old != null)
                old.removeAccount(this);
        }
    }
}
