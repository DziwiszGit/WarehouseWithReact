package pl.warehouse.database;

import pl.warehouse.models.Account;
import pl.warehouse.models.Warehouseman;

import java.util.List;

public interface IAccountDAO {
    void addAccount(String login, String password, Warehouseman warehouseman);
    void deleteAccount(Warehouseman warehouseman);
    Account getAccountByLogin(String login);
    List<Account> getAccountList();
}
