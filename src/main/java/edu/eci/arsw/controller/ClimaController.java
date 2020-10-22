package edu.eci.arsw.controller;

import edu.eci.arsw.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Ciudades")
public class ClimaController {

    @Autowired
    @Qualifier("climaServiceImpl")
    ClimaService cs;

    @RequestMapping(path="/{ciudad}",method = RequestMethod.GET)
    public ResponseEntity<?> getDataByName(@PathVariable(name="ciudad")String ciudad){
        try{
            return new ResponseEntity<>(cs.getDatos(ciudad), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("400 Bad Request", HttpStatus.NOT_FOUND);
        }
    }
}
