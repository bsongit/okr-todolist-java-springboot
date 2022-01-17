package com.werbeson.okrtodolist.service;

import java.util.List;
import java.util.Optional;

import com.werbeson.okrtodolist.domain.User;
import com.werbeson.okrtodolist.repositories.UserRepository;
import com.werbeson.okrtodolist.service.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User findByid(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado! ID" + id + " , Tipo : "+ User.class.getName()));

   }

   public List<User> findAll(){
       return userRepository.findAll();
   }

   public User create(User obj){
       obj.setId(null);
       return userRepository.save(obj);

   }
}
