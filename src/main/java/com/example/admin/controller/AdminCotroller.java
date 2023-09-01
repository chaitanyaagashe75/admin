package com.example.admin.controller;

import com.example.admin.model.Admin;
import com.example.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminCotroller {
    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }

    @PostMapping("/addAll")
    public List<Admin> addAllAdmins(@RequestBody List<Admin> admins) {
        return adminService.addAllAdmins(admins);
    }

    /*@GetMapping("/get/{id}")
    public Admin getAdmin(@PathVariable int id){
        return adminService.getAdmin(id);
    }*/

    @GetMapping("/get")
    public Admin getAdmin(@RequestParam int id) {
        return adminService.getAdmin(id);
    }
}
