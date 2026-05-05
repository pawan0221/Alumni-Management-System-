package alumni_management.controller;

import alumni_management.model.Alumni;
import alumni_management.repository.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumni")
@CrossOrigin
public class AlumniController {

    @Autowired
    private AlumniRepository repository;

    @GetMapping
    public List<Alumni> getAllAlumni() {
        return repository.findAll();
    }
        
    @PostMapping
public Alumni addAlumni(@RequestBody Alumni alumni) {
    return repository.save(alumni);
}

@GetMapping("/count")
public long getTotalAlumni() {
    return repository.count();
}
    
}