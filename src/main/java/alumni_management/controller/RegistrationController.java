package alumni_management.controller;

import alumni_management.model.Alumni;
import alumni_management.model.Registration;
import alumni_management.repository.AlumniRepository;
import alumni_management.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
@CrossOrigin
public class RegistrationController {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private AlumniRepository alumniRepository;

    @GetMapping
    public List<Registration> getAll() {
        return registrationRepository.findAll();
    }

    @PostMapping
    public Registration submit(@RequestBody Registration reg) {
        reg.setStatus("PENDING");
        return registrationRepository.save(reg);
    }

    @PutMapping("/{id}/approve")
    public Registration approve(@PathVariable Long id) {
        Registration reg = registrationRepository.findById(id).orElseThrow();
        reg.setStatus("APPROVED");
        registrationRepository.save(reg);

        // Auto-add to alumni table
        Alumni alumni = new Alumni();
        alumni.setName(reg.getName());
        alumni.setBatch(reg.getBatch());  // both int now ✅
        alumni.setDepartment(reg.getDepartment());
        alumni.setCompany(reg.getCompany());
        alumni.setLocation(reg.getLocation());
        alumniRepository.save(alumni);

        return reg;
    }

    @PutMapping("/{id}/reject")
    public Registration reject(@PathVariable Long id) {
        Registration reg = registrationRepository.findById(id).orElseThrow();
        reg.setStatus("REJECTED");
        return registrationRepository.save(reg);
    }
}