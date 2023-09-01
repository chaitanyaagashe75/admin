package com.example.admin.service.impl;

import com.example.admin.model.Admin;
import com.example.admin.repository.AdminRepository;
import com.example.admin.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> addAllAdmins(List<Admin> admins) {
        return adminRepository.saveAll(admins);
    }

    /*@Override
    public Admin getAdmin(int id) {
        Optional<Admin> OptAdmin = adminRepository.findById(id);
        if (OptAdmin.isPresent()) {
            Admin admin1= OptAdmin.get();
            return admin1;
        } else {
            log.info("Admin's id {id} not found", id);
            return null;
        }

    }
*/
    @Override
    public Admin getAdmin(int id) {
        Optional<Admin> OptAdmin = adminRepository.findById(id);
         if (OptAdmin.isPresent()){
              Admin admin2= OptAdmin.get();
              return admin2;
         }else{
             log.info("id {id} not found",id);
             return null;
         }

    }
}
