package com.example.egreen.UserDB;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface Usr_dao {
    @Insert(onConflict= OnConflictStrategy.IGNORE)
    public void adduser(User user);
    @Query("select * from users where login = :login")
    public List<User> getUser(String login);
    @Query("select * from users")
    public List<User> getUsers();
    @Delete
    public void deletuser(User user);
    @Update
    public void updatuser(User user);
}

