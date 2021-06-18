package interfaz;

import model.User;

public interface IList {
    void addUser (User us);
    void list ();
    int countUser ();
    void deleteUser (User us);
    User getUser (User us);
}
