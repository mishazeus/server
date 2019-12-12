package com.example.server;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class AdminController {
    private final AdminRepository repository;
    AdminController(AdminRepository repository){
        this.repository = repository;
    }

    @GetMapping("/admins")
    List<Admin> all(){
        return repository.findAll();
    }

    @GetMapping("/aut")
    Boolean Autorization(@RequestParam(name = "login")String login,
      @RequestParam(name = "password")String password) {

     List<Admin> admins = repository.findAll();
     Admin admin = new Admin();

        if(true){
            return true;
        }else{
            return false;
        }

    }

    @PostMapping("/admins")
    Admin newGood(@RequestBody Admin newAdmin) {
        return repository.save(newAdmin);
    }

    @GetMapping("/admins/{id}")
    Admin one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new AdminNotFoundException(id));
    }

    @PutMapping("/admins/{id}")
    Admin replaceAdmin(@RequestBody Admin newAdmin, @PathVariable Integer id) {

        return repository.findById(id)
                .map(Admin -> {
                    Admin.setLogin(newAdmin.getLogin());
                    Admin.setPassword(newAdmin.getPassword());
                    Admin.setFio(newAdmin.getFio());
                    Admin.setDatetimechange(newAdmin.getDatetimechange());
                    Admin.setIdchangedperson(newAdmin.getIdchangedperson());

                    return repository.save(Admin);
                })
                .orElseGet(() -> {
                    newAdmin.setId(id);
                    return repository.save(newAdmin);
                });
    }
    @DeleteMapping("/admins/{id}")
    void deleteEmployee(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
