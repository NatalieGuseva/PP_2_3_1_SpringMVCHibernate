package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getByIdUser(Long id);

    public void save(User user);

    public void update(Long id, User updateUser);

    public void delete(Long id);
}
