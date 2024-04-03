package teoria.asociacionUnidireccionalConMultiplicidadMayorAUno;

public class Main {
    public static void main(String[] args) {
        // Crear un anunciante
        Advertiser advertiser = new Advertiser();

        // Crear cuentas
        Account account1 = new Account();
        Account account2 = new Account();

        // Añadir cuentas al anunciante
        advertiser.addAccount(account1);
        advertiser.addAccount(account2);

        // Imprimir la cantidad de cuentas del anunciante
        System.out.println("Cantidad de cuentas del anunciante: " + advertiser.getAccounts().size());

        // Quitar una cuenta al anunciante
        advertiser.removeAccount(account2);

        // Imprimir la cantidad de cuentas actualizada del anunciante
        System.out.println("Cantidad de cuentas del anunciante después de " +
                "eliminar una cuenta: " + advertiser.getAccounts().size());
    }
}
